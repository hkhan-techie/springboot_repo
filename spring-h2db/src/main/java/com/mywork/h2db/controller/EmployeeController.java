package com.mywork.h2db.controller;

import com.mywork.h2db.model.Employee;
import com.mywork.h2db.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }

}
