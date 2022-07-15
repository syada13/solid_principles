package com.solid.openclosed.solution;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/*
 * 2. Move our getAPIPlans method to a new class that implements the previous interface.
 */
public class TextData implements DataService{
    @Override
    public Map<String, Long> getAPIPlans() throws Exception{
        Map<String, Long> apiPlans = new ConcurrentHashMap<>();
	       //code omitted
	
        return apiPlans;
    }
    
}
