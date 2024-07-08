package com.lalithya.employeecrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepoImpl implements EmployeeRepository {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addEmployee(Employee emp) {
        String sql = "INSERT INTO employeetablespring (id, name, department) VALUES (?, ?, ?)";
        Object[] property = new Object[]{emp.getid(), emp.getname(), emp.getdepartment()};
        this.jdbcTemplate.update(sql, property);
        System.out.println("Record created.");
    }

    public void updateEmployee(int id, String name, String department) {
        String sql = "UPDATE employeetablespring SET id = ?, name = ?, department = ? WHERE id = ?";
        this.jdbcTemplate.update(sql, new Object[]{id, name, department, id});
    }

    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employeetablespring WHERE id = ?";
        this.jdbcTemplate.update(sql, new Object[]{id});
    }

    public Employee findbyid(int id) {
        String sql = "SELECT id, name, department FROM employeetablespring WHERE id = ?";
        return (Employee)this.jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
            return new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("department"));
        });
    }
}