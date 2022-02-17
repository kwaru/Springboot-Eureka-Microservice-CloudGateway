package com.example.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod(){

        return "The request is taking longer than expected."+"Please try again later";
    }


    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod(){

        return "The request is taking longer than expected."+"Please try again later";
    }
}
