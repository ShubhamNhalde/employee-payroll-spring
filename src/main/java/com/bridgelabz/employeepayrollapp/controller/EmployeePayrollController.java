package com.bridgelabz.employeepayrollapp.controller;


import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
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
@RequestMapping("/employeePayrollService")
public class EmployeePayrollController {
    @Autowired
    IEmployeePayrollService service;

    //ability to get all employees' data by method in postman Body
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAllDataFromRepo() {
        List<Employee> employeeList = null;
        employeeList = service.getAllData();
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", employeeList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    //ability to save employee details to repository
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> saveDataToRepo(@RequestBody Employee employee) {
        employee = service.postDataToRepo(employee);
        ResponseDTO responseDTO = new ResponseDTO("Created User Successfully", employee);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    //ability to get employee data by id
    @GetMapping("/get/{id}")
    public ResponseEntity<Employee> getDataFromRepoById(@PathVariable Integer id) {
        Employee employee = service.getDataById(id);
        ResponseDTO dto = new ResponseDTO("Get Call for Employee by Id", employee);
        return new ResponseEntity(dto, HttpStatus.OK);
    }

    //ability to update employee data for particular id
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateDataInRepo(@PathVariable Integer id, @RequestBody EmployeeDTO employeeDTO) {
        Employee employee = service.updateDataById(id, employeeDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updating Employee PayrollData Successfully:", employee);
        return new ResponseEntity(employeeDTO, HttpStatus.OK);
    }

    //ability to delete employee data for particular id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteDataInRepo(@PathVariable Integer id) {
        service.deleteDataById(id);
        ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully:", id);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
