package com.example.resume_service.controller;

import com.example.resume_service.model.Resume;
import com.example.resume_service.service.ResumeService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class ResumeController {

    @Autowired
    @Resource
    private ResumeService service;

    @PostMapping("api/uploadResumeDetails")
    @ResponseBody
    public Long uploadResume(@RequestBody Resume resume) {
        try {
           return service.uploadResume(resume);
        } catch (Exception e) {
           throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

    @GetMapping("api/getResumeById")
    @ResponseBody
    public Resume getResumeById(@PathVariable Long id) {
        try {
            return service.getResumeById(id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

    @GetMapping("api/getResumeByName")
    @ResponseBody
    public Resume getResumeById(@PathVariable String name) {
        try {
            return service.getResumeByName(name);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }
}
