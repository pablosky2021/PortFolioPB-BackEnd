
package com.example.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eduId;
    private String school;
    private String title;
    private Long startYear;
    private Long endYear;

    public Education() {
    }

    public Education(String school, String title, Long startYear, Long endYear) {
        this.school = school;
        this.title = title;
        this.startYear = startYear;
        this.endYear = endYear;
    }
    
    
    
    
    
}
