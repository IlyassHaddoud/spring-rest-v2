package com.example.demo.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    private final SubjectRepository subjectRepository;

    @Autowired
    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> getSubjects()
    {
        return this.subjectRepository.findAll();
    }

    public Subject addSubject(Subject subject)
    {
        return this.subjectRepository.save(subject);
    }
}
