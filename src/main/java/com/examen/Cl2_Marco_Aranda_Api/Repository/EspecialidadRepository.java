package com.examen.Cl2_Marco_Aranda_Api.Repository;



import com.examen.Cl2_Marco_Aranda_Api.model.db.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad,String> {
}
