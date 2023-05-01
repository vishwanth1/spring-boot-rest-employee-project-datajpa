package com.vishwa.employee.springproject.service;

import com.vishwa.employee.springproject.dao.EmployeeRepository;
import com.vishwa.employee.springproject.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);

        Employee employeeDetails = null;
        if(employee.isPresent())
        {
            employeeDetails =  employee.get();
        } else {
            throw new RuntimeException("Could not find the employee details");
        }

        return employeeDetails;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}
