package com.example.resume_service.controller;

import java.util.List;

import com.example.resume_service.model.Resume;
import com.example.resume_service.service.ResumeService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
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

    @GetMapping("api/getResumeById/{id}")
    @ResponseBody
    public Resume getResumeById(@PathVariable Long id) {
        try {
            log.info("query for id: {}", id);
            return service.getResumeById(id).get(0);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

    @GetMapping("api/getResumeByName/{name}")
    @ResponseBody
    public List<Resume> getResumeByName(@PathVariable String name) {
        try {
            return service.getResumeByName(name);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }
}
