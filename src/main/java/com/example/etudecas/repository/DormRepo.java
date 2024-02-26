package com.example.etudecas.repository;

import com.example.etudecas.entitties.Dorm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DormRepo extends JpaRepository<Dorm,Long> {
}
