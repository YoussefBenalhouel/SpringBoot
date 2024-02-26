package com.example.etudecas.services;

import com.example.etudecas.entitties.Room;

import java.util.List;

public interface RoomService {
    List<Room>findAll();
    Room saveRoom(Room room);
    void deleteRoom(Long id);
    Room findById(Long id);
    Room updateRoom(Long id,Room room);
}
