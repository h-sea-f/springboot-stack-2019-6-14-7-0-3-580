package com.tw.apistackbase.controller;

import com.tw.apistackbase.Model.Employee;
import com.tw.apistackbase.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {
    @Autowired
    EmployeeRepository repository;

    @GetMapping(value = "/employees",params = "age")
    public List<Employee> list(@RequestParam(name = "age") int age) {
        return repository.findAll(age);
    }

    @GetMapping("/employees")
    public List<Employee> list() {
        return repository.findAll();
    }

    @PostMapping("/employees")
    public void add(@RequestBody Employee employee) {
        repository.add(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteById(@PathVariable String id) {
        repository.deleteById(id);
    }

    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable String id) {
        return repository.findById(id);
    }

}
