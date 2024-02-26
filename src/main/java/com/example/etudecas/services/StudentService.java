package com.example.etudecas.services;

import com.example.etudecas.entitties.Student;

import java.util.List;

public interface StudentService {
    List<Student> findall();
    Student findById(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);

    Student updateStudent(Long id,Student student);

}
