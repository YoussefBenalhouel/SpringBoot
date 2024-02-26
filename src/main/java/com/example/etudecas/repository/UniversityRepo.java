package com.example.etudecas.repository;

import com.example.etudecas.entitties.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepo extends JpaRepository<University,Long> {
}
