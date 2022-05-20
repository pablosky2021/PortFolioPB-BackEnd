


package com.example.portfolio.controller;

import com.example.portfolio.model.Persona;
import com.example.portfolio.service.interfaces.IPersonaService;
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
public class PersonaController {
    
    @Autowired
    private IPersonaService persoServ;
    
    //ResponseBody permite recibir datos desde el cuerpo de la respuesta, a través de un json.
    @GetMapping ("/persona/watch")
    @ResponseBody
    public List<Persona> watchPersona(){
    return persoServ.verPersona();
    }
    
    //RequestBody permite tomar datos desde el cuerpo de la solicitud, a través de un json.
    @PostMapping ("/persona/create")
    public Persona createPersona (@RequestBody Persona pers){
         return persoServ.crearPersona(pers);
    }
    
    @PutMapping ("/persona/update")
    public void updatePersona(@RequestBody Persona pers) {
    persoServ.modificarPersona(pers);
    }


    
    //PathVariable permite tomar la variable desde la ruta y utlizarla en el método.
    //Anotation: poner variable entre llaves, Método: variable precedida de @PathVariable. 
    @DeleteMapping ("/persona/delete/{id}")
    public void deletePersona (@PathVariable Long id){
    persoServ.borrarPersona(id);
    }
    
    //No hay método EDITAR, se utiliza SAVE.
    
}


