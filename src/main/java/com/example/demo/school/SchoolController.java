package com.example.demo.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("schools")
public class SchoolController {
    private final SchoolService schoolService;

    @Autowired
    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping
    public List<School> getSchools()
    {
        return this.schoolService.getSchools();
    }

    @PostMapping
    public School addSchool(@RequestBody School school)
    {
        return this.schoolService.addSchool(school);
    }
}
