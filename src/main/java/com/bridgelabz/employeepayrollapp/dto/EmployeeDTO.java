package com.bridgelabz.employeepayrollapp.dto;

import java.time.LocalDate;

public class EmployeeDTO {
    private String firstName;
    private String lastName;
    private Long salary;
    private LocalDate date;


    public EmployeeDTO() {
        super();
    }

    public EmployeeDTO(String firstName, String lastName, Long salary,
                       LocalDate date) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.date = date;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getSalary() {
        return salary;
    }

    public LocalDate getDate() {
        return date;
    }

}
