package com.nphcda.demo.DTO;

/**
 * @author Olalekan Folayan
 */


public class EventStatus {
   private String name;
    private String value;
    private String status;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EventStatus(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public EventStatus() {
    }

    public EventStatus(String name) {
        this.name = name;
    }
}
