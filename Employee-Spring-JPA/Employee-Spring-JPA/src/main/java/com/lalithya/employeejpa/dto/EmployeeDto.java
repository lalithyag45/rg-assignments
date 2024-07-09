package com.lalithya.employeejpa.dto;

import lombok.Data;

@Data
public class EmployeeDto {
    private Integer id;
    private String name;
    private String department;

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public EmployeeDto(Integer id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public EmployeeDto() {
    }
}
