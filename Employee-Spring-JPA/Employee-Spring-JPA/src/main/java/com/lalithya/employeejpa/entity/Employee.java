package com.lalithya.employeejpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="employeejpa")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String department;

    public String toString() {
        return "Employee{id=" + this.id + ", name='" + this.name + "', department='" + this.department + "'}";
    }

    public Employee() {
    }

    public Employee(Integer id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void createemployeeobj(Integer id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Integer getid() {
        return this.id;
    }

    public String getname() {
        return this.name;
    }

    public String getdepartment() {
        return this.department;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setdepartment(String department) {
        this.department = department;
    }
}