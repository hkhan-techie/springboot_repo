package com.technoflix.springboot.restapidemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest-api")
public class RestApiDemoController {

    @GetMapping
    public String restGetApi() {
        return "Welcome to Rest API demo !!";
    }
}
