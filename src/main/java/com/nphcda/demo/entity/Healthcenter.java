package com.nphcda.demo.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Olalekan Folayan
 */


@Entity
public class Healthcenter {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long healthCenterId;

    String state;
    String lga;
    String healthCenter;
    String active;
    String organizationuit;


    public long getHealthCenterId() {
        return healthCenterId;
    }

    public void setHealthCenterId(long healthCenterId) {
        this.healthCenterId = healthCenterId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLga() {
        return lga;
    }

    public void setLga(String lga) {
        this.lga = lga;
    }

    public String getHealthCenter() {
        return healthCenter;
    }

    public void setHealthCenter(String healthCenter) {
        this.healthCenter = healthCenter;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getOrganizationuit() {
        return organizationuit;
    }

    public void setOrganizationuit(String organizationuit) {
        this.organizationuit = organizationuit;
    }
}
