package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> getStudents()
    {
        return this.studentService.getStudents();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student)
    {
        return this.studentService.addStudent(student);
    }
}
