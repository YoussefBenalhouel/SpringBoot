package com.example.etudecas.entitties;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="bloc")
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nameBloc;
    private Long capacityBloc;

    @ManyToOne
    private Dorm dorm;


    @OneToMany(mappedBy = "bloc")
    private List <Room> roomList;








}
