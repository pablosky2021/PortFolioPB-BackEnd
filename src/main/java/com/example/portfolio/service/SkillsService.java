
package com.example.portfolio.service;

import com.example.portfolio.service.interfaces.ISkillsService;
import com.example.portfolio.model.Skills;
import com.example.portfolio.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService{

    
    //Para vincular Service y Repository, Creo instancia de la Interface Repository:
    //Vinculada con @Autowired
    @Autowired
    public SkillsRepository skillRepo;
    //Ahora puede usarse metodos de JPA.
    
    
    @Override
    public List<Skills> verSkills() {
      return skillRepo.findAll();
        
    }

    @Override
    public Skills crearSkills(Skills skill) {
       return skillRepo.save(skill);
    }

    @Override
    public void borrarSkills(Long skillId) {
       skillRepo.deleteById(skillId);
    }

    @Override
    public Skills buscarSkills(Long skillId) {
       return skillRepo.findById(skillId).orElse(null);
    }
    
    @Override
    public void modificarSkills(Skills skill) {
       skillRepo.save(skill);
    }
    
    
}
