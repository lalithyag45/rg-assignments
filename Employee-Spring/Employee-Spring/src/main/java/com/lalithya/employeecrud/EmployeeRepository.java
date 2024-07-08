package com.lalithya.employeecrud;

public interface EmployeeRepository {
    void addEmployee(Employee employee);

    void updateEmployee(int id, String name, String department);

    void deleteEmployee(int id);

    Employee findbyid(int id);
}