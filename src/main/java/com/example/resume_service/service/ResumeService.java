package com.example.resume_service.service;

import com.example.resume_service.dao.ResumeDao;
import com.example.resume_service.model.Resume;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ResumeService {

    @Resource
    ResumeDao rDao;

    public Long uploadResume(Resume resume) {

        return rDao.create(resume);
    }

    public Resume getResumeById(Long id){
        return new Resume();
    }
    public Resume getResumeByName(String name) {
        return new Resume();
    }
}
