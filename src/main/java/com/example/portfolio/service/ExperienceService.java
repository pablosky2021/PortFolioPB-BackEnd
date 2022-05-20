

package com.example.portfolio.service;

import com.example.portfolio.service.interfaces.IExperienceService;
import com.example.portfolio.model.Experience;
import com.example.portfolio.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService{

    
    //Para vincular Service y Repository, Creo instancia de la Interface Repository:
    //Vinculada con @Autowired
    @Autowired
    public ExperienceRepository expRepo;
    //Ahora puede usarse metodos de JPA.
    
    
    @Override
    public List<Experience> verExperience() {
      return expRepo.findAll();
        
    }

    @Override
    public Experience crearExperience(Experience exp) {
       return expRepo.save(exp);
    }

    @Override
    public void borrarExperience(Long expId) {
       expRepo.deleteById(expId);
    }

    @Override
    public Experience buscarExperience(Long expId) {
       return expRepo.findById(expId).orElse(null);
    }
    
    @Override
    public void modificarExperience(Experience exp) {
       expRepo.save(exp);
    }
    
    
}

