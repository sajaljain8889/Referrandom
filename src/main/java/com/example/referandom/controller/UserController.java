package com.example.referandom.controller;

import com.example.referandom.entities.model.Employee;
import com.example.referandom.entities.model.JobSeeker;
import com.example.referandom.service.interfac.EmployeServiceInterface;
import com.example.referandom.service.interfac.JobSeekerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class UserController {

    private final EmployeServiceInterface employeServiceInterface;
    private final JobSeekerServiceInterface jobSeekerServiceInterface;

    @Autowired
    public UserController(EmployeServiceInterface employeServiceInterface,JobSeekerServiceInterface jobSeekerServiceInterface) {
        this.employeServiceInterface=employeServiceInterface;
        this.jobSeekerServiceInterface=jobSeekerServiceInterface;
    }

    @PostMapping("/jobseeker")
    public JobSeeker createJobSeeker(@RequestBody JobSeeker jobSeeker) {
        return jobSeekerServiceInterface.createJobSeeker(jobSeeker);
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeServiceInterface.createEmployee(employee);
    }
}
