package com.bridgelabz.employeepayrollapp.entity;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import java.time.LocalDate;
@Getter
@Setter
@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;
    private String lastName;
    private Long salary;
    private LocalDate date;


    public Employee() {

        super();
    }

    public Employee(EmployeeDTO employee) {

        this.firstName = employee.getFirstName();
        this.lastName = employee.getLastName();
        this.salary = employee.getSalary();
        this.date = employee.getDate();
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public Long getSalary() {
//        return salary;
//    }
//
//    public void setSalary(Long salary) {
//        this.salary = salary;
//    }
//
//    public LocalDate getDate() {
//        return date;
//    }
//
//
//    public void setDate(LocalDate date) {
//        this.date = date;
//    }

    public void updateDataById(EmployeeDTO employeeDTO) {
        this.updateDataById(employeeDTO);
    }
}

