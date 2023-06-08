package com.ahmetvatansever.studentmanagement.service;

import com.ahmetvatansever.studentmanagement.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
