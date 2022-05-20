
package com.example.portfolio.service.interfaces;

import com.example.portfolio.model.Skills;
import java.util.List;

public interface ISkillsService {
    
    public List<Skills> verSkills ();
    public Skills crearSkills(Skills skill);
    public void borrarSkills(Long skillId);
    public Skills buscarSkills(Long skillId);
    public void modificarSkills(Skills skill);
}
