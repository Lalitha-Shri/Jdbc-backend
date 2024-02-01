package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public Empl1 saveEmployee(@RequestBody Empl1 employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Empl1> getAllEmployees() {
        return employeeService.fetchAllEmployees();
    }
    @GetMapping("/employee/{id}")
    public Empl1 getEmployeeById(@PathVariable("id") Integer id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/employee/{id}")
    public Empl1 updateEmployee(@PathVariable("id") Integer id, @RequestBody Empl1 employee) {
        return employeeService.updateEmployeeById(id, employee);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id) {
        return employeeService.deleteDepartmentById(id);
    }
}
