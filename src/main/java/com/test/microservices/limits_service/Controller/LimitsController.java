package com.test.microservices.limits_service.Controller;

import com.test.microservices.limits_service.Beans.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @GetMapping("/limits")
    public Limits retriveLimits(){
        return new Limits(1,500);
    }
}
