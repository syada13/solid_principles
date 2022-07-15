package com.solid.openclosed.problem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;

/**
 * When we cannot visualize future requirements

For instance, imagine designing and implementing a rate limit algorithm to control the number of requests allowed for every endpoint in a REST API.

The RateLimit class implements an interceptor — HandlerInterceptor — that allows an application to intercept HTTP requests before they reach the service. We can either let the request go through or block it and send back the status code 429.

The team wants to retrieve the number of requests by plan from a text file.

The following getAPIPlans method retrieves those parameters.
*/ 
public class RateLimiter<HttpServletRequest, HttpServletResponse> implements HandleInterceptor<HttpServletRequest, HttpServletResponse>{
    private Map<String, Long> apiPlans;


    @Override
    public  boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
        //getClientID
        apiPlans = getAPIPlans();
        //build Buckets
        //evaluate request per clientID
        //accept(200) or refuse(429) request
        return true;
    }


    private Map<String,Long> getAPIPlans() throws Exception{
        Map<String,Long> apiPlans = new ConcurrentHashMap<>();
         Resource resource = new ClassPathResource("apiPlans.txt");

        try{
            List<String> allLines = Files.readAllLines(Path.get((resource).getURI()));
            for (String line:allLines){
                String[] attributes = line.split(":");
                String plan = attributes[0];
                long capacity = Long.valueOf(attributes[1]).longValue();
                apiPlans.put(plan,capacity);
            }
        }catch(IOException ie){
            throw new RuntimeException(ie.getMessage());
        }
        return apiPlans;
    }
}
