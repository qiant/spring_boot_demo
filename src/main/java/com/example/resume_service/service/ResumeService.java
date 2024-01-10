package com.example.resume_service.service;

import com.example.resume_service.model.Resume;
import com.example.resume_service.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeService {
    @Autowired
    ResumeRepository resumeRepository;
    public Long uploadResume(Resume resume) {
        Resume res = resumeRepository.save(resume);
        return res.getId();
    }

    public Resume getResumeById(Long id){
        return new Resume();
    }
    public Resume getResumeByName(String name) {
        return new Resume();
    }
}
