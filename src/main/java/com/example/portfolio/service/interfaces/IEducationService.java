
package com.example.portfolio.service.interfaces;

import com.example.portfolio.model.Education;
import java.util.List;


public interface IEducationService {
    
    public List<Education> verEducation ();
    public Education crearEducation(Education edu);
    public void borrarEducation(Long eduId);
    public Education buscarEducation(Long eduId);
    public void modificarEducation(Education edu);
    
}
