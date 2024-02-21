package com.example.etudecas.entitties;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name="university")
public class University implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversity;
    private String nameUniversity;
    private String adresse;

    @OneToOne
    private Dorm dorm;



}
