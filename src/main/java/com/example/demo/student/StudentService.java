package com.example.demo.student;

import com.example.demo.subject.Subject;
import com.example.demo.subject.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    private final StudentRepository studentRepository;

    private final SubjectRepository subjectRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository,SubjectRepository subjectRepository) {
        this.studentRepository = studentRepository;
        this.subjectRepository = subjectRepository;
    }

    public List<Student> getStudents()
    {
        return this.studentRepository.findAll();
    }
    public Student addStudent(Student student)
    {
        return this.studentRepository.save(student);
    }

    public Student addSubjectToStudent(Integer studentId,Integer subjectId)
    {
        Student student = this.studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("Student Not Found"));
        Subject subject = this.subjectRepository.findById(subjectId).orElseThrow(() -> new RuntimeException("Subject Not Found"));

        student.getSubjects().add(subject);
        return this.studentRepository.save((student));
    }

}
