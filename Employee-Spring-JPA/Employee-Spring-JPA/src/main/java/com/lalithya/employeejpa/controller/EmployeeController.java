package com.lalithya.employeejpa.controller;

import com.lalithya.employeejpa.dto.EmployeeDto;
import com.lalithya.employeejpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {


    private EmployeeService empservice;
    @Autowired
    public void setEmpservice(EmployeeService empservice) {
        this.empservice = empservice;
    }

    @PostMapping
    public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto edto){
        return new ResponseEntity<>(empservice.createEmployee(edto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getbyid(@PathVariable Integer id){
        EmployeeDto edto = empservice.getbyid(id);
        return ResponseEntity.ok(edto);
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<EmployeeDto> updateemployee(@PathVariable Integer id, @RequestBody Map<String,String> request){
        System.out.println("Received Request: " + request); // Log the entire request map
        String department = request.get("department");
        System.out.println("Extracted Department: " + department); // Log the extracted department
        EmployeeDto edto = empservice.updateEmployee(id, department);
        return ResponseEntity.ok(edto);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getallemployees(){
        List<EmployeeDto> li = empservice.getallemployees();
        return ResponseEntity.ok(li);
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> deleteemployee(@PathVariable Integer id){
        empservice.deleteemployee(id);
        return ResponseEntity.ok("Deleted Successfully");
    }



}
