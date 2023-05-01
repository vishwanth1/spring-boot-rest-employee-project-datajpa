package com.vishwa.employee.springproject.service;

import com.vishwa.employee.springproject.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);


}
