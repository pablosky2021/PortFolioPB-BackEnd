

package com.example.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long expId;
    private String company;
    private String position;
    private Long startYear;
    private Long endYear;

    public Experience() {
    }

    public Experience(String company, String position, Long startYear, Long endYear) {
        this.company = company;
        this.position = position;
        this.startYear = startYear;
        this.endYear = endYear;
    }
    
    
    
    
    
}


