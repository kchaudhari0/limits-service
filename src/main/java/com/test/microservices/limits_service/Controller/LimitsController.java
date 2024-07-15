package com.test.microservices.limits_service.Controller;

import com.test.microservices.limits_service.Beans.Limits;
import com.test.microservices.limits_service.Configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retriveLimits(){
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
