
package com.example.portfolio.service.interfaces;

import com.example.portfolio.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> verPersona ();
    public Persona crearPersona(Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
    public void modificarPersona(Persona per);
}
