package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.entity.Employee;

import java.util.List;

public interface IEmployeePayrollService {

     Employee postDataToRepo(Employee employee);

    List<Employee> getAllData();

    Employee getDataById(Integer id);

    Employee updateDataById(Integer id, EmployeeDTO employee);

     String deleteDataById(Integer id);
}
