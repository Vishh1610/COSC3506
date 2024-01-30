package com.algomau.project.COSC3506;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-service")
    public CurrencyServiceConfiguration retrieveAllCourses(){
        return configuration;

    }
}
