package com.lalithya.employeejpa.service;

import com.lalithya.employeejpa.dto.EmployeeDto;
import com.lalithya.employeejpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto emp);
    EmployeeDto getbyid(Integer id);
    EmployeeDto updateEmployee(Integer id, String department);
    List<EmployeeDto> getallemployees();
    void deleteemployee(Integer id);
}
