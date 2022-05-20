
package com.example.portfolio.controller;

import com.example.portfolio.model.Education;
import com.example.portfolio.service.interfaces.IEducationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducationController {

@Autowired
private IEducationService educaServ;
    
    //ResponseBody permite recibir datos desde el cuerpo de la respuesta, a través de un json.
    @GetMapping ("/education/watch")
    @ResponseBody
    public List<Education> watchEducation(){
        return educaServ.verEducation();
    }

    //RequestBody permite tomar datos desde el cuerpo de la solicitud, a través de un json.
    @PostMapping ("/education/create")
    @ResponseBody
    public Education createEducation (@RequestBody Education educ){
        return educaServ.crearEducation(educ);
    }
    
    //No hay método EDITAR, se utiliza SAVE.
    @PutMapping ("/education/update")
        public void updateEducation(@RequestBody Education educ) {
        educaServ.modificarEducation(educ);
    }

    
    //PathVariable permite tomar la variable desde la ruta y utlizarla en el método.
    //Anotation: poner variable entre llaves, Método: variable precedida de @PathVariable. 
    @DeleteMapping ("/education/delete/{eduId}")
    public void deleteEducation (@PathVariable Long eduId){
    educaServ.borrarEducation(eduId);
    }
    
    
    
    
}
