package com.examen.Cl2_Marco_Aranda_Api.controller;

import com.examen.Cl2_Marco_Aranda_Api.model.db.Alumno;
import com.examen.Cl2_Marco_Aranda_Api.model.db.Especialidad;
import com.examen.Cl2_Marco_Aranda_Api.service.AlumnoService;
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
@RequestMapping(path="api/v1/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("")
    public ResponseEntity<List<Alumno>> listarAlumno(){
        List<Alumno> alumnoList = new ArrayList<>();
        alumnoService.listarAlumno().forEach(alumnoList::add);
        if(alumnoList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return  new ResponseEntity<>(alumnoList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alumno> obtenerespecialidadXid(@PathVariable("id") String id){
        return new ResponseEntity<>(alumnoService.buscarAlumxId(id).get(),HttpStatus.OK);
    }

}
