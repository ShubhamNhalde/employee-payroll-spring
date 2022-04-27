package com.bridgelabz.employeepayrollapp.repository;

import com.bridgelabz.employeepayrollapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeePayrollRepository extends JpaRepository<Employee, Integer> {
    @Query(value = "select * from emp_payroll, employee_department where employee_id and department = :department", nativeQuery = true)
    List<Employee> findEmployeeByDepartment(String department);

}
