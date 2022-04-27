package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.entity.Employee;
import com.bridgelabz.employeepayrollapp.exception.EmployeePayrollException;
import com.bridgelabz.employeepayrollapp.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Autowired
    EmployeePayrollRepository repository;


    @Override
    public Employee postDataToRepo(Employee employeeDTO) {
       Employee empPost = new Employee(employeeDTO);
        repository.save(empPost);
        return empPost;
    }

    @Override
    public List<Employee> getAllData() {
        List<Employee> list = repository.findAll();
        return list;
    }



    @Override
    public Employee getDataById(Integer id) {
        Optional<Employee> newEmployee = repository.findById(id);
        if (newEmployee.isPresent()) {
            return newEmployee.get();
        } else throw new EmployeePayrollException("Employee id not found");
    }


    @Override
    public Employee updateDataById(Integer id, EmployeeDTO employee) {
        Employee empData = this.getDataById(id);
        empData.updateDataById(employee);
        return repository.save(empData);
    }


    public String deleteDataById(Integer id) {
        repository.deleteById(id);
        return null;
    }

    public List<Employee> getDataByDepartment(String department) {
        List<Employee> newEmp = repository.findEmployeeByDepartment(department);
        if (newEmp.isEmpty()) {
            throw new EmployeePayrollException("Employee Not Found");
        }
        return newEmp;
    }
}
