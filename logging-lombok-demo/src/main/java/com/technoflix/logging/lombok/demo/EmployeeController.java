package com.technoflix.logging.lombok.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest-api")
public class EmployeeController {
    static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee(1, "Hidayath"));
        employees.add(new Employee(2, "John"));
    }

    private final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        for (int i = 0; i < 10; i++) {
            logger.info("Logging******* :{}", i);
        }
        return employees;
    }

    @PostMapping("/addEmployee")
    public List<Employee> addEmployee(@RequestBody Employee employee) {
        employees.add(employee);
        return employees;
    }
}
