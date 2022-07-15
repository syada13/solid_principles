package com.solid.openclosed.solution;

import java.util.Map;
/*
 * Enabling the Open-Closed Principle:
 * Firstly, and thinking abstractly, create an interface and define a contract that will include all required functionalities.
 */
public interface DataService {
    public Map<String, Long> getAPIPlans();
}
