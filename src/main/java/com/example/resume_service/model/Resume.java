package com.example.resume_service.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Resume {
    @Id
    private Long id;
    private String name;
    private String firstName;
    private String lastName;
    private String title;    // current job title
    private String jobDescription; // current job description
    private String company; //current job company

    public Resume(){

    }

    public Resume(String name, String firstName, String lastName, String title, String jobDescription, String company) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;    // current job title
        this.jobDescription = jobDescription; // current job description
        this.company = company;
    }

    @Override
    public String toString() {
        return "Resume [id=" + id + ", name=" + name + ", company=" + company + "]";
    }
}
