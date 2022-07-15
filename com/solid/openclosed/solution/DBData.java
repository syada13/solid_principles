package com.solid.openclosed.solution;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

/*
 * Thanks to abstractions, we can create a new class to implement getAPIPlans with different behavior, 
 * in this case, to retrieve parameters from a database.
 * 
 * Introducing a new abstraction layer with different implementations avoids tight coupling between classes.
 */
public class DBData  implements DataService{
    private DataSource dataSource;

    public DBData(DataSource dataSource){
        this.dataSource = dataSource;

    }

    @Override
    public Map<String, Long> getAPIPlans() throws Exception{
        Map<String, Long> apiPlans = new ConcurrentHashMap<>();
        
        /* code ommitted
        for (Plan plan: dataSource.getAPIPlans()){

        }
        */ 
        return apiPlans; 
    }

    
}
