package com.example.securitymasterdemo.dao;

import com.example.securitymasterdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
}
