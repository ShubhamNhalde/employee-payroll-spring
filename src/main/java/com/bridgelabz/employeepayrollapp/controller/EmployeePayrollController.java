package com.bridgelabz.employeepayrollapp.controller;


import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.entity.Employee;
import com.bridgelabz.employeepayrollapp.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeePayrollController {
    @Autowired
    IEmployeePayrollService service;

    @GetMapping("/employeePayrollService")
    public ResponseEntity<String> getWelcome() {
        return new ResponseEntity<String>(service.getWelcome(), HttpStatus.OK);
    }

    //ability to save employee details to repository
    @PostMapping("/employeePayrollService/create")
    public ResponseEntity<ResponseDTO> saveDataToRepo(@RequestBody Employee employee) {
          employee = service.postDataToRepo(employee);
        ResponseDTO responseDTO = new ResponseDTO("Created User Successfully",employee);
        return new ResponseEntity<ResponseDTO> (responseDTO,HttpStatus.OK);
    }

    //ability to get all employees' data by method
    @GetMapping("/employeePayrollService/get")
    public ResponseEntity<List<Employee>> getAllDataFromRepo() {
        return new ResponseEntity<List<Employee>>(service.getAllData(), HttpStatus.OK);
    }

    //ability to get employee data by id
    @GetMapping("/employeePayrollService/get/{id}")
    public ResponseEntity<Optional<Employee>> getDataFromRepoById(@PathVariable Integer id) {
        return new ResponseEntity<Optional<Employee>>(service.getDataById(id), HttpStatus.OK);
    }

    //ability to update employee data for particular id
    @PutMapping("/employeePayrollService/update/{id}")
    public ResponseEntity<Employee> updateDataInRepo(@PathVariable Integer id, @RequestBody Employee employee) {
        return new ResponseEntity<Employee>(service.updateDataById(id, employee), HttpStatus.OK);
    }

    //ability to delete employee data for particular id
    @DeleteMapping("/employeePayrollService/delete/{id}")
    public ResponseEntity<String> deleteDataInRepo(@PathVariable Integer id) {
        return new ResponseEntity<String>(service.deleteDataById(id), HttpStatus.OK);
    }
}
