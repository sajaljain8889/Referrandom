package com.example.referandom.entities.model;

import com.example.referandom.entities.enums.UserType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @Id
    private Long employeeId;
    private String name;
    private String companyName;

    private String designation;
    private String ProfileDesc;
    private String empCurrLocation;
    private Long currSalary;
    private Long expectedSalary;
    private Long userEmpId;



}
