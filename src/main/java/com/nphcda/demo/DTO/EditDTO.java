package com.nphcda.demo.DTO;

public class EditDTO {
    String trackedentitype;
    String idtype;
    String vacnum;
    String idnum;
    String dob;
    String phone;

    String sex;
    String familyname;
    String othername;

    String email;
    String picture;
    String QR;








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

    public EditDTO(String trackedentitype, String idtype, String vacnum, String idnum, String dob, String phone, String sex, String familyName, String othername, String email, String QR) {
        this.trackedentitype = trackedentitype;
        this.idtype = idtype;
        this.vacnum = vacnum;
        this.idnum = idnum;
        this.dob = dob;
        this.phone=phone;
        this.sex= sex;
        this.familyname=familyName;
        this.othername=othername;
        this.email=email;
        this.QR= QR;
    }


    public EditDTO() {
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


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getQR() {
        return QR;
    }

    public void setQR(String QR) {
        this.QR = QR;
    }
}
