package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeePayrollService {

    public Employee postDataToRepo(Employee employee);

    public List<Employee> getAllData();

    Employee getDataById(Integer id);

    Employee updateDataById(Integer id, EmployeeDTO employee);

    public String deleteDataById(Integer id);
}
