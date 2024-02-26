package com.example.etudecas.repository;

import com.example.etudecas.entitties.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<Room,Long> {
}
