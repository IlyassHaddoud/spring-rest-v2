package com.example.demo.student;

import com.example.demo.profile.Profile;
import com.example.demo.school.School;
import com.example.demo.subject.Subject;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class CreateStudentDTO {
    @NotBlank(message = "name can not be blank")
    @NotNull(message = "name can not be null")
    private String name;
    @NotBlank(message = "email can not be blank")
    @NotNull(message = "email can not be null")
    private String email;
    private String password;
    private Profile profile;
    private School school;
    private List<Subject> subjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
