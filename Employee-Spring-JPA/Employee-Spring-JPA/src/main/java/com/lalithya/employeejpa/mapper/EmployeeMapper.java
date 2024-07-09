package com.lalithya.employeejpa.mapper;

import com.lalithya.employeejpa.dto.EmployeeDto;
import com.lalithya.employeejpa.entity.Employee;

public class EmployeeMapper {
    public static Employee mapToEmployee(EmployeeDto edto){
        Employee emp = new Employee(
                edto.getId(),
                edto.getName(),
                edto.getDepartment()

        );
        return emp;
    }

    public static EmployeeDto mapToDto(Employee emp){
        EmployeeDto edto = new EmployeeDto(
                emp.getid(),
                emp.getname(),
                emp.getdepartment()
        );
        return edto;
    }
}
