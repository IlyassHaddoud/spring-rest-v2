package com.example.demo.student;

import com.example.demo.subject.Subject;
import com.example.demo.subject.SubjectRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final SubjectRepository subjectRepository;

    private final ModelMapper modelMapper;

    @Autowired
    public StudentService(StudentRepository studentRepository,SubjectRepository subjectRepository,ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.subjectRepository = subjectRepository;
        this.modelMapper = modelMapper;
    }

    public List<Student> getStudents()
    {
        return this.studentRepository.findAll();
    }
    public Student addStudent(CreateStudentDTO createStudentDTO)
    {
        return this.studentRepository.save(convertToStudent(createStudentDTO));
    }

    public Student addSubjectToStudent(Integer studentId,Integer subjectId)
    {
        Student student = this.studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("Student Not Found"));
        Subject subject = this.subjectRepository.findById(subjectId).orElseThrow(() -> new RuntimeException("Subject Not Found"));

        student.getSubjects().add(subject);
        return this.studentRepository.save(student);
    }

    public Student convertToStudent(CreateStudentDTO createStudentDTO)
    {
        return this.modelMapper.map(createStudentDTO,Student.class);
    }
}
