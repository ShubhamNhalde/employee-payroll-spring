package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.entity.Employee;
import com.bridgelabz.employeepayrollapp.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Autowired
    EmployeePayrollRepository repository;


    public String getWelcome() {
        return "Welcome to Employee Payroll Application";
    }

    @Override
    public Employee postDataToRepo(Employee employee) {
        repository.save(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllData() {
        List<Employee> list = repository.findAll();
        return list;
    }

    @Override
    public Optional<Employee> getDataById(Integer id) {
        Optional<Employee> newEmployee = repository.findById(id);
        return newEmployee;
    }

    public Employee updateDataById(Integer id, Employee employee) {
        Employee newEmployee = new Employee(id, employee.getFirstName(), employee.getLastName(), employee.getSalary(), employee.getDate());
        repository.save(newEmployee);
        return newEmployee;
    }

    public String deleteDataById(Integer id) {
        repository.deleteById(id);
        return "Employee with ID:" + id + " got deleted";
    }
}
