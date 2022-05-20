
package com.example.portfolio.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long skillId;
    private String name;
    private Long percent;
    private String image;
   

    public Skills() {
    }

    public Skills(Long skillId, String name, Long percent, String image) {
        this.skillId = skillId;
        this.name = name;
        this.percent = percent;
        this.image = image;
    }

    
    
    
    
}
