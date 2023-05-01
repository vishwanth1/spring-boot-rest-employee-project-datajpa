package com.vishwa.employee.springproject.dao;

import com.vishwa.employee.springproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
