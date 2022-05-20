
package com.example.portfolio.service.interfaces;

import com.example.portfolio.model.Experience;
import java.util.List;


public interface IExperienceService {
    
    public List<Experience> verExperience ();
    public Experience crearExperience(Experience exp);
    public void borrarExperience(Long expId);
    public Experience buscarExperience(Long expId);
    public void modificarExperience(Experience exp);
    
}
