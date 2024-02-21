package com.example.etudecas.entitties;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    @Temporal(TemporalType.DATE)
    private Date universityYear;
    private Boolean isValid;



    @ManyToMany
    private List<Student> students;






}
