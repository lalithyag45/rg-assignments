package com.lalithya.employeecrud;

public interface EmployeeService {
    void addEmployee(Employee employee);

    void updateEmployee(int id, String name, String department);

    void deleteEmployee(int id);

    Employee getbyid(int id);
}