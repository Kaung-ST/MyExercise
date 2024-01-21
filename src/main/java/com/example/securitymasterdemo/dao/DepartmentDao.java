package com.example.securitymasterdemo.dao;

import com.example.securitymasterdemo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentDao extends JpaRepository<Department,Integer> {
}
