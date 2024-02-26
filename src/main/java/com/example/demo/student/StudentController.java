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

    @PostMapping("/{student_id}/subjects/{subject_id}")
    public Student addSubjectToStudent(@PathVariable Integer student_id,@PathVariable Integer subject_id)
    {
        return this.studentService.addSubjectToStudent(student_id,subject_id);
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student)
    {
        return this.studentService.addStudent(student);
    }
}
