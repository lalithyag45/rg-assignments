package com.lalithya.employeecrud;

public class Employee {
    private int id;
    private String name;
    private String department;

    public String toString() {
        return "Employee{id=" + this.id + ", name='" + this.name + "', department='" + this.department + "'}";
    }

    public Employee() {
    }

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void createemployeeobj(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    int getid() {
        return this.id;
    }

    String getname() {
        return this.name;
    }

    String getdepartment() {
        return this.department;
    }

    void setid(int id) {
        this.id = id;
    }

    void setname(String name) {
        this.name = name;
    }

    void setdepartment(String department) {
        this.department = department;
    }
}