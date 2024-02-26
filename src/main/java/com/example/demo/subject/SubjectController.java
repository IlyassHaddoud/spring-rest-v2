package com.example.demo.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("subjects")
public class SubjectController {
    private final SubjectService subjectService;

    @Autowired
    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping
    public List<Subject> getSubjects()
    {
        return this.subjectService.getSubjects();
    }

    @PostMapping
    public Subject addSubject(@RequestBody Subject subject)
    {
        return this.subjectService.addSubject(subject);
    }
}
