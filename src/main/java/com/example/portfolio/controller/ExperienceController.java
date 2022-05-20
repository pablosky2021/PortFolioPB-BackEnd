
package com.example.portfolio.controller;

import com.example.portfolio.model.Experience;
import com.example.portfolio.service.interfaces.IExperienceService;
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
public class ExperienceController {

@Autowired
private IExperienceService expeServ;
    
    //ResponseBody permite recibir datos desde el cuerpo de la respuesta, a través de un json.
    @GetMapping ("/experience/watch")
    @ResponseBody
    public List<Experience> watchExperience(){
        return expeServ.verExperience();
    }

    //RequestBody permite tomar datos desde el cuerpo de la solicitud, a través de un json.
    @PostMapping ("/experience/create")
    @ResponseBody
    public Experience createExperience (@RequestBody Experience expe){
        return expeServ.crearExperience(expe);
    }
    
    //No hay método EDITAR, se utiliza SAVE.
    @PutMapping ("/experience/update")
        public void updateExperience(@RequestBody Experience expe) {
        expeServ.modificarExperience(expe);
    }

    
    //PathVariable permite tomar la variable desde la ruta y utlizarla en el método.
    //Anotation: poner variable entre llaves, Método: variable precedida de @PathVariable. 
    @DeleteMapping ("/experience/delete/{expId}")
    public void deleteExperience (@PathVariable Long expId){
    expeServ.borrarExperience(expId);
    }
    
    
    
    
}

