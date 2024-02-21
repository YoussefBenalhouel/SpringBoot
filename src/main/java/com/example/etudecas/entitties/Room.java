package com.example.etudecas.entitties;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="room")
public class Room implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRoom;
    private Long numberRoom;
    @Enumerated(EnumType.STRING)
    private RoomType roomType;

    @ManyToOne
    @JoinColumn(name = "Bloc_ID")
    private Bloc bloc;

    @OneToMany()
    private List<Reservation> reservationList;

    @OneToOne
    private University university;

}
