package com.example.resume_service.dao;

import com.example.resume_service.model.Resume;

public class ResumeDao {

    public Long create(Resume resume) {
        return 1L;
    }

    public Resume getResumeById(Long id){
        return new Resume();
    }

    public Resume getResumeByName(String name) {
        return new Resume();
    }
}
