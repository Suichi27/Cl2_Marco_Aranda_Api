package com.examen.Cl2_Marco_Aranda_Api.model.db;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
    @Getter
    @Setter
    @Entity
    @Table(name = "Especialidad")
    public class Especialidad {
        @Id
        private String idesp;

        @Column(name="nomesp")
        private String nomesp;

        @Column(name="costo")
        private Double costo;


}
