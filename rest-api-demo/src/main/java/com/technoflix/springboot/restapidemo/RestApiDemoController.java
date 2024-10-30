package com.technoflix.springboot.restapidemo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest-api")
public class RestApiDemoController {
    static List<Employee> employees= new ArrayList<>();
    static {
         employees.add(new Employee(1, "Hidayath"));
         employees.add(new Employee(2, "John"));
    }


    @GetMapping
    public String restGetApi() {
        return "Welcome to Rest API demo !!";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employees;
    }

    @PostMapping("/addEmployee")
    public List<Employee> addEmployee(@RequestBody Employee employee) {
        employees.add(employee);
        return employees;
    }
}
