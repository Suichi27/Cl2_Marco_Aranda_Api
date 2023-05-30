package com.examen.Cl2_Marco_Aranda_Api.service;


import com.examen.Cl2_Marco_Aranda_Api.Repository.AlumnoRepository;
import com.examen.Cl2_Marco_Aranda_Api.model.db.Alumno;
import com.examen.Cl2_Marco_Aranda_Api.model.db.Especialidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<Alumno> listarAlumno(){
        return alumnoRepository.findAll();
    }

    public Optional<Alumno> buscarAlumxId(String id){
        Optional<Alumno> alumno = alumnoRepository.findById(id);
        if(alumno.isEmpty()){
            return Optional.empty();
        }else{
            return alumno;
        }
    }

    public Alumno registrar(Alumno alumno){
        return alumnoRepository.save(alumno);
    }

    public HashMap<String,String> eliminar(String id){

        HashMap<String,String> respuesta= new HashMap<String,String>();
        alumnoRepository.deleteById(id);
        respuesta.put("mensaje","elemento eliminado");
        return respuesta;
    }

}
