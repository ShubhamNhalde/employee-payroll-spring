package com.bridgelabz.employeepayrollapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@Getter
public @ToString class EmployeeDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee firstName is Invalid")
    @NotEmpty(message = "Employee firstName Can't Be Null")
    private String firstName;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee lastName is Invalid")
    @NotEmpty(message = "Employee lastName Can't Be Null")
    private String lastName;

    @Pattern(regexp = "male|female", message = "Gender needs to be male or female")
    private String gender;
    @Min(value = 500, message = "Salary should be more than 500")
    private Long salary;
    @JsonFormat(pattern = "yyy MM dd")
    @NotNull(message = "startDate should Not be Empty")
    // @PastorPresent (message = "startDate should be past or todays date")
    private LocalDate date;

    @NotBlank(message = "Note cannot be Empty")
    private String note;

    @NotBlank(message = " profilePic cannot be Empty")
    private String profilePic;

    @NotNull(message = "department should Not be Empty")
    private List<String> department;


    public EmployeeDTO(String firstName, String lastName, Long salary,
                       LocalDate date, String gender, String note, String profilePic,  List<String> departments) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.date = date;
        this.gender = gender;
        this.note = note;
        this.profilePic = profilePic;
        this.department = departments;
    }

    public List<String> getDepartments() {
        return null;
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
