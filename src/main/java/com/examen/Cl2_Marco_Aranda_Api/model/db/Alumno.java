package com.examen.Cl2_Marco_Aranda_Api.model.db;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="alumno")
@Getter
@Setter
@NoArgsConstructor
public class Alumno {
@Id
    private String idalumno;
@Column(name="apealumno")
private String apealumno;
@Column(name="nomalumno")
    private String nomalumno;
@JsonBackReference
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="idesp")
    private Especialidad especialidad;

@Column(name="proce")
    private String proce;

}


