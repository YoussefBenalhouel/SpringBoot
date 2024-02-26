package com.example.etudecas.repository;

import com.example.etudecas.entitties.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
