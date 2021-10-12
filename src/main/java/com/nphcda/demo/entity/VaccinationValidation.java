package com.nphcda.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VaccinationValidation {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;


}
