package com.bridgelabz.employeepayrollapp.dto;

import lombok.Getter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Getter
public class EmployeeDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee firstName is Invalid")
    @NotEmpty(message = "Employee firstName Can't Be Null")
    private String firstName;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee lastName is Invalid")
    @NotEmpty(message = "Employee lastName Can't Be Null")
    private String lastName;
    @Min(value = 500, message = "Salary should be more than 500")
    private Long salary;
    @PastOrPresent(message = "Date should be past or today date")
    private LocalDate date;


    public EmployeeDTO(String firstName, String lastName, Long salary,
                       LocalDate date) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.date = date;
    }


//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public Long getSalary() {
//        return salary;
//    }
//
//    public LocalDate getDate() {
//        return date;
//    }

}
