package com.examen.Cl2_Marco_Aranda_Api.Repository;


import com.examen.Cl2_Marco_Aranda_Api.model.db.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, String>

{


}
