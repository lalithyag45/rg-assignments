package com.lalithya.employeecrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepo;

    @Autowired
    public void setEmployeeRepo(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public void addEmployee(Employee employee) {
        this.employeeRepo.addEmployee(employee);
    }

    public void updateEmployee(int id, String name, String department) {
        this.employeeRepo.updateEmployee(id, name, department);
    }

    public void deleteEmployee(int id) {
        this.employeeRepo.deleteEmployee(id);
    }

    public Employee getbyid(int id) {
        return this.employeeRepo.findbyid(id);
    }
}