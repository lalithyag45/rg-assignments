package com.lalithya.employeejpa.service;

import com.lalithya.employeejpa.dto.EmployeeDto;
import com.lalithya.employeejpa.entity.Employee;
import com.lalithya.employeejpa.mapper.EmployeeMapper;
import com.lalithya.employeejpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.lalithya.employeejpa.mapper.EmployeeMapper.mapToDto;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeerepo;

    @Autowired
    public void setEmployeerepo(EmployeeRepository employeerepo) {
        this.employeerepo = employeerepo;
    }

    @Override
    public EmployeeDto createEmployee(EmployeeDto edto) {
        Employee emp = EmployeeMapper.mapToEmployee(edto);
        Employee saveemp=employeerepo.save(emp);
        return EmployeeMapper.mapToDto(saveemp);

    }

    @Override
    public EmployeeDto getbyid(Integer id) {
//        Employee emp=employeerepo.findById(id);
        Employee employee =  employeerepo.findById(id).orElseThrow(()-> new RuntimeException("Employee not found"));
        return EmployeeMapper.mapToDto(employee);

    }

    @Override
    public EmployeeDto updateEmployee(Integer id, String department) {
        Employee employee =  employeerepo.findById(id).orElseThrow(()-> new RuntimeException("Employee not found"));
        employee.setdepartment(department);
        Employee emp=employeerepo.save(employee);
        return  EmployeeMapper.mapToDto(emp);


    }

    @Override
    public List<EmployeeDto> getallemployees() {
        List<Employee> emps = employeerepo.findAll();
        return emps.stream().map((emp)->EmployeeMapper.mapToDto(emp)).collect(Collectors.toList());

    }

    @Override
    public void deleteemployee(Integer id) {
        Employee employee =  employeerepo.findById(id).orElseThrow(()-> new RuntimeException("Employee not found"));
        employeerepo.delete(employee);
    }
}
