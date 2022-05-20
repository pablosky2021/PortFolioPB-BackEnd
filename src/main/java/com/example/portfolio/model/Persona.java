
package com.example.portfolio.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String title1;
    private String title2;
    private String about;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String title1, String title2, String about) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.title1 = title1;
        this.title2 = title2;
        this.about = about;
    }
    
    
    
    
}
