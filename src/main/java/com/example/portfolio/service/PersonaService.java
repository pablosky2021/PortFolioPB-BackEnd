
package com.example.portfolio.service;

import com.example.portfolio.service.interfaces.IPersonaService;
import com.example.portfolio.model.Persona;
import com.example.portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersona() {
        return persoRepo.findAll();
    }

    @Override
    public Persona crearPersona(Persona per) {
        return persoRepo.save(per);
        
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
        
    }

    @Override
    public void modificarPersona(Persona per) {
        persoRepo.save(per);
        
    }
    
    
}
