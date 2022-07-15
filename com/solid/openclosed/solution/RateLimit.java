package com.solid.openclosed.solution;

import java.util.Map;

import com.solid.openclosed.problem.HandleInterceptor;

/*
 * We refactor our RateLimit class aggregating an instance of the DataService type in its constructor method.
 * If later we decided to retrieve the parameters from a NoSQL database, we would no longer have to touch the code, create a new class that implements getAPIPlans, and instantiate this new class in RateLimit.

Even if, instead of implementing the HandlerInterceptor interface, we implement a Filter to design our Rate Limit algorithm, we can reuse the DataService interface as one of its dependencies.

Calling to getAPIPlans is now fixed (closed for modification). If we want it to behave differently, we implement it in a new class (open for extension) that will follow the contracts defined in our interface.

Our new DBData dependency is instantiated in our RateLimit class thanks to the magic of the Dependency Injection principle.
 */

public class RateLimit<HttpServletRequest, HttpServletResponse> implements HandleInterceptor<HttpServletRequest, HttpServletResponse>{
    private Map<String,Long> apiPlans;
    private DataService dataService;

    public RateLimit(DataService dataService){
        this.dataService = dataService;
    }

    public  boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
        //getClientID
        apiPlans = dataService.getAPIPlans();
        //build Buckets
        //evaluate request per clientID
        //accept(200) or refuse(429) request
        return true;
    }
    
}
