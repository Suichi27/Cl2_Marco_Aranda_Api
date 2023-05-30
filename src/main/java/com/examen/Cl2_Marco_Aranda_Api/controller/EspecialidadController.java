package com.examen.Cl2_Marco_Aranda_Api.controller;

import com.examen.Cl2_Marco_Aranda_Api.model.db.Especialidad;
import com.examen.Cl2_Marco_Aranda_Api.service.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path="api/v1/especialidad")
public class EspecialidadController {
    @Autowired
    private EspecialidadService especialidadService;

    @GetMapping("")
    public ResponseEntity<List<Especialidad>> listarEspecialidad(){
        List<Especialidad> especialidadList = new ArrayList<>();
        especialidadService.listarEspecialidad().forEach(especialidadList::add);
        if(especialidadList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return  new ResponseEntity<>(especialidadList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Especialidad> obtenerespecialidadXid(@PathVariable("id") String id){
        return new ResponseEntity<>(especialidadService.buscarEspxId(id).get(),HttpStatus.OK);
    }
}
