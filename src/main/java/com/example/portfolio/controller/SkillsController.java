
package com.example.portfolio.controller;

import com.example.portfolio.model.Skills;
import com.example.portfolio.service.interfaces.ISkillsService;
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
public class SkillsController {

@Autowired
private ISkillsService skillServ;
    
    //ResponseBody permite recibir datos desde el cuerpo de la respuesta, a través de un json.
    @GetMapping ("/skills/watch")
    @ResponseBody
    public List<Skills> watchSkills(){
        return skillServ.verSkills();
    }

    //RequestBody permite tomar datos desde el cuerpo de la solicitud, a través de un json.
    @PostMapping ("/skills/create")
    @ResponseBody
    public Skills createSkills (@RequestBody Skills skills){
        return skillServ.crearSkills(skills);
    }
    
    //No hay método EDITAR, se utiliza SAVE.
    @PutMapping ("/skills/update")
        public void updateSkills(@RequestBody Skills skills) {
        skillServ.modificarSkills(skills);
    }

    
    //PathVariable permite tomar la variable desde la ruta y utlizarla en el método.
    //Anotation: poner variable entre llaves, Método: variable precedida de @PathVariable. 
    @DeleteMapping ("/skills/delete/{skillId}")
    public void deleteSkills (@PathVariable Long skillId){
    skillServ.borrarSkills(skillId);
    }
    
    
    
    
}
