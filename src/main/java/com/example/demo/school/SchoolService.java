package com.example.demo.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;

    @Autowired
    public SchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }
    public List<School> getSchools()
    {
        return this.schoolRepository.findAll();
    }

    public School addSchool(School school)
    {
        return this.schoolRepository.save(school);
    }
}
