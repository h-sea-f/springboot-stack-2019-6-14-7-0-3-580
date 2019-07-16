package com.tw.apistackbase.repository;

import com.tw.apistackbase.Model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRepository {
    Map<String, Employee> employees = new HashMap<>();

    public EmployeeRepository() {
        employees.put("111", new Employee("111", "sean", 3, "man"));
        employees.put("222", new Employee("222", "sean", 3, "man"));
        employees.put("333", new Employee("333", "sean", 3, "man"));
    }

    public List<Employee> findAll() {
        return new ArrayList<>(employees.values());
    }

    public void add(Employee employee) {
        this.employees.put(employee.getId(), employee);
    }

    public void deleteById(String id) {
        if (employees.get(id) != null) {
            employees.remove(id);
        }
    }

    public Employee findById(String id) {
        return employees.get(id);
    }
}
