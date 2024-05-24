package com.example.EmployeeAPIProj.repository;

import com.example.EmployeeAPIProj.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
