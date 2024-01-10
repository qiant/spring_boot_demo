package com.example.resume_service.model;


import lombok.Data;
@Data
public class Resume {
    private String name;
    private String firstName;
    private String lastName;
    private String title;    // current job title
    private String jobDescription; // current job description
    private String company; //current job company
}
