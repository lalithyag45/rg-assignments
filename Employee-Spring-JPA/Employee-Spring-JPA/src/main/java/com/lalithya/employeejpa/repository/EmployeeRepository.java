package com.lalithya.employeejpa.repository;

import com.lalithya.employeejpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
