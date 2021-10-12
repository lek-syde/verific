package com.nphcda.demo.EventDTO;

import com.nphcda.demo.DTO.Vaccination;

import java.util.List;

public class VaccinationHistory {

    List<Vaccination> myVaccinations;


    public List<Vaccination> getMyVaccinations() {
        return myVaccinations;
    }

    public void setMyVaccinations(List<Vaccination> myVaccinations) {
        this.myVaccinations = myVaccinations;
    }

    public VaccinationHistory(List<Vaccination> myVaccinations) {
        this.myVaccinations = myVaccinations;
    }
}
