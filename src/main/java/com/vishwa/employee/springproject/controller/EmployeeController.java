package com.vishwa.employee.springproject.controller;

import com.vishwa.employee.springproject.entity.Employee;
import com.vishwa.employee.springproject.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll()
    {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable int employeeId)
    {
        Employee employee =  employeeService.findById(employeeId);

        if(employee == null)
        {
            throw new RuntimeException("Employee id not Found" + employeeId);
        }

        return employee;
    }

    @PostMapping("/employees")
    public Employee save(@RequestBody Employee employee)
    {
        return employeeService.save(employee);
    }

    @PutMapping("/employees")
    public Employee update(@RequestBody Employee employee)
    {
        return employeeService.save(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void delete(@PathVariable int employeeId)
    {
        employeeService.deleteById(employeeId);
    }
}
