package com.bridgelabz.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class EmployeePayrollAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication
                .run(EmployeePayrollAppApplication.class, args);
        log.info("Employee payroll app started", context.getEnvironment().getProperty("environment"));
    }

}
