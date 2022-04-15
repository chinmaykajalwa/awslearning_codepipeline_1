package com.chinmay.aws.beanstalk.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Deploying spring boot rest API application on AWS using elastic beanstalk on "+ LocalDate.now();
    }
}
