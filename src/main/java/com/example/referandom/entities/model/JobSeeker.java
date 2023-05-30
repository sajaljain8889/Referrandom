package com.example.referandom.entities.model;

import com.example.referandom.entities.enums.UserType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import org.bson.conversions.Bson;

import java.util.List;

@Data

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class JobSeeker {
    private Long jobSeekerId;
    private List<String> expectedRoles;
    private String currentLocation;

    private String githubURL;
    private String linkedinURL;


    private List<Bson> certificates;
    private String name;
    private List<String> keySkills;
    private List<String> ExperianceDetails;
    private int totalExperiance;
    private Bson Resume;

    private Long currSalary;
    private Long expectedSalary;
    private Long jobSeekerUserId;

    @Enumerated(EnumType.STRING)
    private UserType userType;
}
