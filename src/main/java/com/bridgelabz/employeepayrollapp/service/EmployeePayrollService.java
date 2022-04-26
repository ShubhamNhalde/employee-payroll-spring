package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
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


    public String getWelcome () {
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
    public Employee getDataById(Integer id) {

        return repository.getById(id);
    }

    @Override
    public Employee updateDataById(Integer id, EmployeeDTO employee) {
        Employee empData = this.getDataById(id);
        empData.updateDataById(employee);
        return repository.save(empData);
    }


//    public Employee updateDataById(int id, EmployeeDTO employeeDTO) {
//      //  Employee newEmployee = this.getDataById(id);
//        Employee employee = this.getDataById(id);
//        employee.updateDataById(employeeDTO);
//        return repository.save(newEmployee);;
//    }

    public String deleteDataById(Integer id) {
        repository.deleteById(id);
        return "Employee with unique ID:" + id + " got deleted";
    }
}
