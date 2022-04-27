package com.bridgelabz.employeepayrollapp.entity;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "emp_payroll")
public @Data class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private int employeeId;
    private String firstName;
    private String lastName;
    @Column(name = "profile_pic" )
    private String profilePic;
    @ElementCollection
    @CollectionTable(name="employee_department",joinColumns= @JoinColumn(name="id"))
    private List<String> department;
    private Long salary;
    private LocalDate date;
    private String notes;


    public Employee(Employee employeeDTO) {

        super();
    }

    public Employee(EmployeeDTO employeeDTO) {

        this.firstName = employeeDTO.getFirstName();
        this.lastName = employeeDTO.getLastName();
        this.salary = employeeDTO.getSalary();
        this.date = employeeDTO.getDate();
        this.profilePic = employeeDTO.getProfilePic();
        this.notes = employeeDTO.getNote();
        this.department = employeeDTO.getDepartments();
    }

    public Employee() {

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
        this.firstName = employeeDTO.getFirstName();
        this.lastName = employeeDTO.getLastName();
        this.salary = employeeDTO.getSalary();
        this.date = employeeDTO.getDate();
        this.profilePic = employeeDTO.getProfilePic();
        this.notes = employeeDTO.getNote();
        this.department = employeeDTO.getDepartments();
    }

}

