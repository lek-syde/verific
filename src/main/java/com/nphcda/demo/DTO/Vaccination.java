package com.nphcda.demo.DTO;

/**
 * @author Olalekan Folayan
 */


public class Vaccination {
    String pos;
    String vaccineType;
    String vaccineDate;
    String vaccinebatchNumber;


    public String getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(String vaccineType) {
        this.vaccineType = vaccineType;
    }

    public String getVaccineDate() {
        return vaccineDate;
    }

    public void setVaccineDate(String vaccineDate) {
        this.vaccineDate = vaccineDate;
    }

    public String getVaccinebatchNumber() {
        return vaccinebatchNumber;
    }

    public void setVaccinebatchNumber(String vaccinebatchNumber) {
        this.vaccinebatchNumber = vaccinebatchNumber;
    }

    public Vaccination(String pos, String vaccineType, String vaccineDate, String vaccinebatchNumber) {
        this.vaccineType = vaccineType;
        this.vaccineDate = vaccineDate;
        this.vaccinebatchNumber = vaccinebatchNumber;
        this.pos=pos;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }
}
