
package com.example.portfolio.service;

import com.example.portfolio.service.interfaces.IEducationService;
import com.example.portfolio.model.Education;
import com.example.portfolio.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService{

    
    //Para vincular Service y Repository, Creo instancia de la Interface Repository:
    //Vinculada con @Autowired
    @Autowired
    public EducationRepository eduRepo;
    //Ahora puede usarse metodos de JPA.
    
    
    @Override
    public List<Education> verEducation() {
      return eduRepo.findAll();
        
    }

    @Override
    public Education crearEducation(Education edu) {
       return eduRepo.save(edu);
    }

    @Override
    public void borrarEducation(Long eduId) {
       eduRepo.deleteById(eduId);
    }

    @Override
    public Education buscarEducation(Long eduId) {
       return eduRepo.findById(eduId).orElse(null);
    }
    
    @Override
    public void modificarEducation(Education edu) {
       eduRepo.save(edu);
    }
    
    
}
