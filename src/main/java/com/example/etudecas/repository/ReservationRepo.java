package com.example.etudecas.repository;

import com.example.etudecas.entitties.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation,Long> {
}
