package com.examen.Cl2_Marco_Aranda_Api.service;


import com.examen.Cl2_Marco_Aranda_Api.Repository.EspecialidadRepository;
import com.examen.Cl2_Marco_Aranda_Api.model.db.Especialidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.tags.MessageTag;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class EspecialidadService {
    @Autowired
    private EspecialidadRepository especialidadRepository;

    public List<Especialidad> listarEspecialidad() {return especialidadRepository.findAll();}

    public Optional<Especialidad> buscarEspxId(String id){
        Optional<Especialidad> especialidad = especialidadRepository.findById(id);
        if(especialidad.isEmpty()){
            return Optional.empty();
        }else{
            return especialidad;
        }
    }

    public Especialidad registrar(Especialidad especialidad){
        return especialidadRepository.save(especialidad);
    }

    public HashMap<String,String> eliminar(String id){

        HashMap<String,String> respuesta= new HashMap<String,String>();
       especialidadRepository.deleteById(id);
       respuesta.put("mensaje","elemento eliminado");
       return respuesta;
    }

}
