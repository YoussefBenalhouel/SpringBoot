package com.example.etudecas.entitties;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="dorm")
public class Dorm implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDorm;
    private String nameDorm;
    private Long capacityDorm;

    @OneToMany(mappedBy = "dorm")
    private List<Bloc>blocList;

    @OneToOne(mappedBy = "dorm")
    private University university;


}
