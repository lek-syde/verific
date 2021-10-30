package com.nphcda.demo.DTO;

public class EditDTO {
    String trackedentitype;
    String idtype;
    String vacnum;
    String idnum;
    String dob;
    String phone;
    private String orgUnit;


    public String getOrgUnit() {
        return orgUnit;
    }

    public void setOrgUnit(String orgUnit) {
        this.orgUnit = orgUnit;
    }

    public String getTrackedentitype() {
        return trackedentitype;
    }

    public void setTrackedentitype(String trackedentitype) {
        this.trackedentitype = trackedentitype;
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getVacnum() {
        return vacnum;
    }

    public void setVacnum(String vacnum) {
        this.vacnum = vacnum;
    }

    public EditDTO(String trackedentitype, String idtype, String vacnum, String idnum, String dob, String phone) {
        this.trackedentitype = trackedentitype;
        this.idtype = idtype;
        this.vacnum = vacnum;
        this.idnum = idnum;
        this.dob = dob;
        this.phone=phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "EditDTO{" +
                "trackedentitype='" + trackedentitype + '\'' +
                ", idtype='" + idtype + '\'' +
                ", vacnum='" + vacnum + '\'' +
                ", idnum='" + idnum + '\'' +
                ", dob='" + dob + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


}
