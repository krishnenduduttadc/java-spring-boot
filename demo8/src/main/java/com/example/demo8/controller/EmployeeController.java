package com.example.demo8.controller;

import com.example.demo8.model.Employee;
import com.example.demo8.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeRepository repo;

    public EmployeeController(EmployeeRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return repo.save(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }
}
