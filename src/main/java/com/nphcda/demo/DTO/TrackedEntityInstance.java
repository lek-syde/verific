
package com.nphcda.demo.DTO;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "created",
        "orgUnit",
        "createdAtClient",
        "trackedEntityInstance",
        "lastUpdated",
        "trackedEntityType",
        "lastUpdatedAtClient",
        "inactive",
        "deleted",
        "featureType",
        "programOwners",
        "enrollments",
        "relationships",
        "attributes"
})
@Generated("jsonschema2pojo")
public class TrackedEntityInstance {

    String vaccinationid;

    String phonenumber;

    String dob;

    String idtypee;

    String idnum;

    @JsonProperty("created")
    private String created;
    @JsonProperty("orgUnit")
    private String orgUnit;
    @JsonProperty("createdAtClient")
    private String createdAtClient;
    @JsonProperty("trackedEntityInstance")
    private String trackedEntityInstance;
    @JsonProperty("lastUpdated")
    private Date lastUpdated;
    @JsonProperty("trackedEntityType")
    private String trackedEntityType;
    @JsonProperty("lastUpdatedAtClient")
    private String lastUpdatedAtClient;

    private String secondDoseDate;
    private String firstDoseDate;

    @JsonProperty("inactive")
    private Boolean inactive;
    @JsonProperty("deleted")
    private Boolean deleted;
    @JsonProperty("featureType")
    private String featureType;
    @JsonProperty("programOwners")
    private List<ProgramOwner> programOwners;

    @JsonProperty("enrollments")
    private List<Enrollment> enrollments;

    @JsonProperty("relationships")
    private List<Object> relationships;
    @JsonProperty("attributes")
    private List<Attribute> attributes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("orgUnit")
    public String getOrgUnit() {
        return orgUnit;
    }

    @JsonProperty("orgUnit")
    public void setOrgUnit(String orgUnit) {
        this.orgUnit = orgUnit;
    }

    @JsonProperty("createdAtClient")
    public String getCreatedAtClient() {
        return createdAtClient;
    }

    @JsonProperty("createdAtClient")
    public void setCreatedAtClient(String createdAtClient) {
        this.createdAtClient = createdAtClient;
    }

    @JsonProperty("trackedEntityInstance")
    public String getTrackedEntityInstance() {
        return trackedEntityInstance;
    }

    @JsonProperty("trackedEntityInstance")
    public void setTrackedEntityInstance(String trackedEntityInstance) {
        this.trackedEntityInstance = trackedEntityInstance;
    }

    @JsonProperty("lastUpdated")
    public Date getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("lastUpdated")
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("trackedEntityType")
    public String getTrackedEntityType() {
        return trackedEntityType;
    }

    @JsonProperty("trackedEntityType")
    public void setTrackedEntityType(String trackedEntityType) {
        this.trackedEntityType = trackedEntityType;
    }

    @JsonProperty("lastUpdatedAtClient")
    public String getLastUpdatedAtClient() {
        return lastUpdatedAtClient;
    }

    @JsonProperty("lastUpdatedAtClient")
    public void setLastUpdatedAtClient(String lastUpdatedAtClient) {
        this.lastUpdatedAtClient = lastUpdatedAtClient;
    }

    @JsonProperty("inactive")
    public Boolean getInactive() {
        return inactive;
    }

    @JsonProperty("inactive")
    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }

    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @JsonProperty("featureType")
    public String getFeatureType() {
        return featureType;
    }

    @JsonProperty("featureType")
    public void setFeatureType(String featureType) {
        this.featureType = featureType;
    }

    @JsonProperty("programOwners")
    public List<ProgramOwner> getProgramOwners() {
        return programOwners;
    }

    @JsonProperty("programOwners")
    public void setProgramOwners(List<ProgramOwner> programOwners) {
        this.programOwners = programOwners;
    }

    @JsonProperty("enrollments")
    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    @JsonProperty("enrollments")
    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    @JsonProperty("relationships")
    public List<Object> getRelationships() {
        return relationships;
    }

    @JsonProperty("relationships")
    public void setRelationships(List<Object> relationships) {
        this.relationships = relationships;
    }

    @JsonProperty("attributes")
    public List<Attribute> getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    @Override
    public String toString() {
        return "TrackedEntityInstance{" +
                "created='" + created + '\'' +
                ", orgUnit='" + orgUnit + '\'' +
                ", createdAtClient='" + createdAtClient + '\'' +
                ", trackedEntityInstance='" + trackedEntityInstance + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", trackedEntityType='" + trackedEntityType + '\'' +
                ", lastUpdatedAtClient='" + lastUpdatedAtClient + '\'' +
                ", inactive=" + inactive +
                ", deleted=" + deleted +
                ", featureType='" + featureType + '\'' +
                ", programOwners=" + programOwners +
                ", enrollments=" + enrollments +
                ", relationships=" + relationships +
                ", attributes=" + attributes +
                ", additionalProperties=" + additionalProperties +
                '}';
    }


    @JsonIgnore
    public String getAttributeZeroName() {
        return attributes.get(0).getDisplayName();
    }



    @JsonIgnore
    public String getAttributeZero() {
        return attributes.get(0).getValue();
    }

    public void setAttributeZero(String value) {
        attributes.get(0).setValue(value);
    }


    @JsonIgnore
    public String getAttributeOne() {
        return attributes.get(1).getValue();
    }

    public void setAttributeOne(String value) {
        attributes.get(1).setValue(value);
    }

    @JsonIgnore
    public String getAttributeOneName() {
        return attributes.get(1).getDisplayName();
    }




    @JsonIgnore
    public String getAttributeTwo() {
        return attributes.get(2).getValue();
    }

    public void setAttributeTwo(String value) {
        attributes.get(2).setValue(value);
    }

    @JsonIgnore
    public String getAttributeTwoName() {
        return attributes.get(2).getDisplayName();
    }



    @JsonIgnore
    public String getAttributeThree() {
        return attributes.get(3).getValue();
    }

    public void setAttributeThree(String value) {
        attributes.get(3).setValue(value);
    }

    @JsonIgnore
    public String getAttributeThreeName() {
        return attributes.get(3).getDisplayName();
    }





    @JsonIgnore
    public String getAttributeFour() {
        return attributes.get(4).getValue();
    }

    public void setAttributeFour(String value) {
        attributes.get(4).setValue(value);
    }

    @JsonIgnore
    public String getAttributeFourName() {
        return attributes.get(4).getDisplayName();
    }




    @JsonIgnore
    public String getAttributeFive() {
        return attributes.get(5).getValue();
    }

    public void setAttributeFive(String value) {
        attributes.get(5).setValue(value);
    }

    @JsonIgnore
    public String getAttributeFiveName() {
        return attributes.get(5).getDisplayName();
    }




    @JsonIgnore
    public String getAttributeSix() {
        return attributes.get(6).getValue();
    }

    public void setAttributeSix(String value) {
        attributes.get(6).setValue(value);
    }

    @JsonIgnore
    public String getAttributeSixName() {
        return attributes.get(6).getDisplayName();
    }


    @JsonIgnore
    public String getAttributeSeven() {
        return attributes.get(7).getValue();
    }

    public void setAttributeSeven(String value) {
        attributes.get(7).setValue(value);
    }

    @JsonIgnore
    public String getAttributeSevenName() {
        return attributes.get(7).getDisplayName();
    }


    @JsonIgnore
    public String getAttributeEight() {
        return attributes.get(8).getValue();
    }

    public void setAttributeEight(String value) {
        attributes.get(8).setValue(value);
    }

    @JsonIgnore
    public String getAttributeEightName() {
        return attributes.get(8).getDisplayName();
    }



    @JsonIgnore
    public String getAttributeTen() {
        return attributes.get(10).getValue();
    }

    public void setAttributeTen(String value) {
        attributes.get(10).setValue(value);
    }

    @JsonIgnore
    public String getAttributeTenName() {
        return attributes.get(10).getDisplayName();
    }


    @JsonIgnore
    public String getAttributeNine() {
        return attributes.get(9).getValue();
    }

    public void setAttributeNine(String value) {
        attributes.get(9).setValue(value);
    }

    @JsonIgnore
    public String getAttributeNineName() {
        return attributes.get(9).getDisplayName();
    }


    @JsonIgnore
    public String getAttributeEleven() {
        return attributes.get(11).getValue();
    }

    public void setAttributeEleven(String value) {
        attributes.get(11).setValue(value);
    }

    @JsonIgnore
    public String getAttributeElevenName() {
        return attributes.get(11).getDisplayName();
    }


    @JsonIgnore
    public String getAttributeTwelve() {
        return attributes.get(12).getValue();
    }

    public void setAttributeTwelve(String value) {
        attributes.get(12).setValue(value);
    }

    @JsonIgnore
    public String getAttributeTwelveName() {
        return attributes.get(12).getDisplayName();
    }


    @JsonIgnore
    public String getAttributeThirteen() {
        try {
            return attributes.get(13).getValue();
        }catch (Exception e){

            return "";
        }

    }

    public void setAttributeThirteen(String value) {
        attributes.get(13).setValue(value);
    }

    @JsonIgnore
    public String getAttributeThirteenName() {

        try {
            return attributes.get(13).getDisplayName();
        }catch (Exception e){

            return "";
        }

    }

    @JsonIgnore
    public String getAttributeFourteen() {
        try {
            return attributes.get(14).getValue();
        }catch (Exception e){

            return "";
        }

    }

    public void setAttributeFourteen(String value) {
        attributes.get(14).setValue(value);
    }


    @JsonIgnore
    public String getAttributeFourteenName() {

        try {
            return attributes.get(14).getDisplayName();
        }catch (Exception e){

            return "";
        }



    }
    @JsonIgnore
    public String getAttributeFifteen() {
        try {
            return attributes.get(15).getValue();
        }catch (Exception e){

            return "";
        }

    }

    public void setAttributeFifteen(String value) {
        attributes.get(15).setValue(value);
    }

    @JsonIgnore
    public String getAttributeFifteenName() {

        try {
            return attributes.get(15).getDisplayName();
        }catch (Exception e){

            return "";
        }



    }

    @JsonIgnore
    public String getAttributeSixteen() {
        try {
            return attributes.get(16).getValue();
        }catch (Exception e){

            return "";
        }

    }

    @JsonIgnore
    public String getAttributeSixteenName() {
        try {
            return attributes.get(16).getDisplayName();
        }catch (Exception e){

            return "";
        }

    }

    public void setAttributeSixteen(String value) {
        try{
            attributes.get(16).setValue(value);
        }catch (Exception e){

        }
    }



    @JsonIgnore
    public boolean isLocked() {

        for (int i=0; i<attributes.size(); i++) {



            String de = attributes.get(i).getAttribute();
            String value = attributes.get(i).getValue();

            if (de.contains("Kmh0uBf0GI5")) {
                if (value.contains("lk")){
                 return true;
                }

            }


        }
        return false;
    }


    @JsonIgnore
    public String getVaccinnationID() {

        for (int i=0; i<attributes.size(); i++) {



            String de = attributes.get(i).getAttribute();
            String value = attributes.get(i).getValue();

            if (de.contains("izttywqePh2")) {
                return value;

            }


        }
        return "-";
    }


    @JsonIgnore
    public String getDHISPhoneNumber() {

        for (int i=0; i<attributes.size(); i++) {



            String de = attributes.get(i).getAttribute();
            String value = attributes.get(i).getValue();

            if (de.contains("Xhzv5vjYeOW")) {
                return value;

            }


        }
        return "-";
    }


    @JsonIgnore
    public String getDHISEMAIL() {

        for (int i=0; i<attributes.size(); i++) {



            String de = attributes.get(i).getAttribute();
            String value = attributes.get(i).getValue();

            if (de.contains("N18AMajv6sh")) {
                return value;

            }


        }
        return "-";
    }



    @JsonIgnore
    public String getFamilyName() {


        for (int i=0; i<attributes.size(); i++) {

            String de = attributes.get(i).getAttribute();
            String value = attributes.get(i).getValue();

            if (de.contains("aW66s2QSosT")) {
                return value;

            }


        }
        return "-";
    }



    @JsonIgnore
    public String getOtherNames() {






        for (int i=0; i<attributes.size(); i++) {



            String de = attributes.get(i).getAttribute();
            String value = attributes.get(i).getValue();

            if (de.contains("TfdH5KvFmMy")) {
                return value;

            }


        }
        return "-";
    }

    @JsonIgnore
    public String getGender() {





        for (int i=0; i<attributes.size(); i++) {



            String de = attributes.get(i).getAttribute();
            String value = attributes.get(i).getValue();

            if (de.contains("CklPZdOd6H1")) {
                return value;

            }


        }
        return "-";
    }


    @JsonIgnore
    public String getDOB()  {





        for (int i=0; i<attributes.size(); i++) {


            String de = attributes.get(i).getAttribute();
            String value = attributes.get(i).getValue();
            String newDateString;
            if (de.contains("mAWcalQYYyk")) {

                SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date date1=formatter.parse(value);
                    final String NEW_FORMAT = "dd-MM-yyyy";
                    formatter.applyPattern(NEW_FORMAT);
                    newDateString = formatter.format(date1);

                } catch (ParseException e) {
                    e.printStackTrace();
                    return value;

                }


                System.out.println("dob"+ newDateString);
                return newDateString;

            }


        }
        return "-";
    }



    @JsonIgnore
    public String getQRCode() {




        if(enrollments!=null){
            for (int i=0; i<enrollments.get(0).getEvents().size(); i++){


                for (int k=0; k< enrollments.get(0).getEvents().get(i).getDataValues().size(); k++){

                    String de= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getDataElement();
                    String value= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getValue();
                    if(de.contains("LavUrktwH5D")){
                        return value;

                    }

                }

            }
        }


        return "";
    }

    @JsonIgnore
    public String getVaccinnatedFirstDose() {





        for (int i=0; i<enrollments.get(0).getEvents().size(); i++){

            for (int k=0; k< enrollments.get(0).getEvents().get(i).getDataValues().size(); k++){

                String de= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getDataElement();
                String value= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getValue();
                if(de.contains("wOyOg4cO6uO")){
                    return value;

                }

            }

        }
        return "false";
    }


    @JsonIgnore
    public String getVaccinnatedFirstDoseCenter() {





        for (int i=0; i<enrollments.get(0).getEvents().size(); i++){

            for (int k=0; k< enrollments.get(0).getEvents().get(i).getDataValues().size(); k++){

                String de= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getDataElement();
                String value= enrollments.get(0).getEvents().get(i).getOrgUnitName();
                if(de.contains("wOyOg4cO6uO")){
                    return value;

                }

            }

        }
        return "false";
    }


    @JsonIgnore
    public String getVaccinatedSecondDoseCenter() throws ParseException {





        for (int i=0; i<enrollments.get(0).getEvents().size(); i++){


            for (int k=0; k< enrollments.get(0).getEvents().get(i).getDataValues().size(); k++){


                String de= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getDataElement();
                String value= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getValue();
                String center= enrollments.get(0).getEvents().get(i).getOrgUnitName();


                if(de.contains("LUIsbsm3okG")){

                    if(value.contains("DOSE2")){


                        return center;
                    }




                }
            }

        }
        return "false";
    }

    @JsonIgnore
    public String getVaccationtype() {





        for (int i=0; i<enrollments.get(0).getEvents().size(); i++){

            for (int k=0; k< enrollments.get(0).getEvents().get(i).getDataValues().size(); k++){

                String de= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getDataElement();
                String value= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getValue();

                if(de.contains("c7FAZD2q7nJ")){
                    if (value.contains("as")){

                        return "Astrazenca";
                    }else if(value.contains("moderna")){
                        return "Moderna";
                    }else if (value.contains("johnson")){
                        return "Johnson";
                    }

                }

            }

        }
        return "-";
    }


    @JsonIgnore
    public String getVaccinatedSecondDose() throws ParseException {





        for (int i=0; i<enrollments.get(0).getEvents().size(); i++){


            for (int k=0; k< enrollments.get(0).getEvents().get(i).getDataValues().size(); k++){


                String de= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getDataElement();
                String value= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getValue();


                if(de.contains("LUIsbsm3okG")){

                    if(value.contains("DOSE2")){


                        return "true";
                    }




                }
            }

        }
        return "false";
    }


    public String getFirstDose() throws ParseException {


        for (int i=0; i<enrollments.get(0).getEvents().size(); i++){

            String eventDate= enrollments.get(0).getEvents().get(i).getEventDate();
            for (int k=0; k< enrollments.get(0).getEvents().get(i).getDataValues().size(); k++){

                String de= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getDataElement();
                String value= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getValue();


                if(de.contains("LUIsbsm3okG")){

                    if(value.contains("DOSE1")){


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.ENGLISH);

                        if(eventDate!=null){
                            Date date = inputFormat.parse(eventDate);

                            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                            String strDate= formatter.format(date);
                            return strDate;
                        }


                    }




                }

            }

        }
        return "false";



    }

    public boolean checkEligible() throws ParseException {


        for (int i=0; i<enrollments.get(0).getEvents().size(); i++){

            String eventDate= enrollments.get(0).getEvents().get(i).getEventDate();
            for (int k=0; k< enrollments.get(0).getEvents().get(i).getDataValues().size(); k++){

                String de= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getDataElement();
                String value= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getValue();


                if(de.contains("LUIsbsm3okG")){

                    if(value.contains("DOSE1")){


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.ENGLISH);

                        if(eventDate!=null){
                            Date date = inputFormat.parse(eventDate);
                           int weekbtwn= getWeeksBetween(date, new Date());


                            if(getVaccinatedSecondDose().equalsIgnoreCase("false") && getVaccationtype()=="Astrazenca" && weekbtwn>=6){
                                return  true;
                            }else if(getVaccinatedSecondDose().equalsIgnoreCase("false") && getVaccationtype()=="Moderna" && weekbtwn>=4){
                                return  true;
                            }else if(getVaccinatedSecondDose().equalsIgnoreCase("false") && getVaccationtype()=="Pfizer" && weekbtwn>=3){
                                return  true;
                            }

                            return  false;
                        }


                    }




                }

            }

        }
        return  false;


    }

    public static int getWeeksBetween (Date a, Date b) {

        if (b.before(a)) {
            return -getWeeksBetween(b, a);
        }
        a = resetTime(a);
        b = resetTime(b);

        Calendar cal = new GregorianCalendar();
        cal.setTime(a);
        int weeks = 0;
        while (cal.getTime().before(b)) {
            // add another week
            cal.add(Calendar.WEEK_OF_YEAR, 1);
            weeks++;
        }
        return weeks;
    }

    public static Date resetTime (Date d) {
        Calendar cal = new GregorianCalendar();
        cal.setTime(d);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }


    public int getFirstDosePhase() throws ParseException {


        for (int i=0; i<enrollments.get(0).getEvents().size(); i++){

            String eventDate= enrollments.get(0).getEvents().get(i).getEventDate();
            for (int k=0; k< enrollments.get(0).getEvents().get(i).getDataValues().size(); k++){

                String de= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getDataElement();
                String value= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getValue();


                if(de.contains("LUIsbsm3okG")){

                    if(value.contains("DOSE1")){


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);



                        if(eventDate!=null){
                            Date date = inputFormat.parse(eventDate);
                            Date phasetwo = parseDate("2021-08-16");

                            if(date.after(phasetwo)){
                                System.out.println("ONE PHASE TWO");
                                return 2;
                            }else{
                                System.out.println("ONE PHASE ONE");
                                return 1;
                            }

                        }




                    }




                }

            }

        }
        return 0;



    }


    public int getSecondDosePhase() throws ParseException {


        for (int i=0; i<enrollments.get(0).getEvents().size(); i++){



            String eventDate=enrollments.get(0).getEvents().get(i).getEventDate();
            for (int k=0; k< enrollments.get(0).getEvents().get(i).getDataValues().size(); k++){

                String de= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getDataElement();
                String value= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getValue();



                if(de.contains("LUIsbsm3okG")){

                    if(value.contains("DOSE2")){


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);

                        if(eventDate!=null){
                            Date date = inputFormat.parse(eventDate);



                            Date phasetwo = parseDate("2021-08-16");


                            if(date.after(phasetwo)){

                                System.out.println("SECOND PHASE TWO");
                                return 2;
                            }else{
                                System.out.println("SECOND PHASE ONE");
                                return 1;
                            }
                        }


                    }




                }

            }

        }
        return 0;

    }






    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }


    public String getIdType(){

        for (int i=0; i<attributes.size(); i++) {



            String de = attributes.get(i).getAttribute();
            String value = attributes.get(i).getValue();

            if (de.contains("OvGXY097Hxt")) {

                if(value.equalsIgnoreCase("IP")){
                    return "PASSPORT";
                }else if(value.equalsIgnoreCase("VC")){
                    return "VOTERS CARD";
                }else if(value.equalsIgnoreCase("DL")){
                    return "DRIVER LICENSE";
                }else
                return value.toUpperCase();

            }


        }
        return "-";



    }



    public String getIdType2(){

        for (int i=0; i<attributes.size(); i++) {



            String de = attributes.get(i).getAttribute();
            String value = attributes.get(i).getValue();

            if (de.contains("OvGXY097Hxt")) {



                if(value.equalsIgnoreCase("IP")){
                    return "International Passport";
                }else if(value.equalsIgnoreCase("VC")){
                    return "Voters Card";
                }else if(value.equalsIgnoreCase("DL")){
                    return "Driver's License";
                }else
                    return value.toUpperCase();

            }


        }
        return "";



    }

    public String getDocumentId(){

        for (int i=0; i<attributes.size(); i++) {



            String de = attributes.get(i).getAttribute();
            String value = attributes.get(i).getValue();

            if (de.contains("fXHMMrKgEWk")) {
                return value.toUpperCase();

            }


        }
        return "-";

    }


    public String getSiteID(){
        if(getVaccationtype()!="Johnson"){
            return secondDoseVacsiteid();
        }else{
            return firstdoseVacsiteid();
        }
    }

    public boolean displaydot() throws ParseException {

        DateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.US);





            Date phasetwo = parseDate("2021-10-10");



        if(getVaccationtype()!="Johnson" && getVaccinatedSecondDose().equalsIgnoreCase("true") && getSecondDoseDate()!="false"){
            Date date = inputFormat.parse(getSecondDoseDate());
            if(date.after(phasetwo)){
                System.out.println("Authentication Phase");
                return true;
            }

        }else if(getVaccationtype()=="Johnson"){

            Date date = inputFormat.parse(getFirstDose());
            if(date.after(phasetwo)){
                System.out.println("Authentication Phase");
                return true;
            }else{
                System.out.println("Your Safe");
                return false;
            }

        }
        return false;
    }

    private String firstdoseVacsiteid() {
        for (int i=0; i<enrollments.get(0).getEvents().size(); i++){

            String eventDate= enrollments.get(0).getEvents().get(i).getEventDate();
            String orgUnit= enrollments.get(0).getEvents().get(i).getOrgUnit();
            for (int k=0; k< enrollments.get(0).getEvents().get(i).getDataValues().size(); k++){

                String de= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getDataElement();
                String value= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getValue();


                if(de.contains("LUIsbsm3okG")){

                    if(value.contains("DOSE1")){


                        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.ENGLISH);

                        if(eventDate!=null){

                            return orgUnit;
                        }


                    }




                }

            }

        }
        return "false";
    }


    public String getfirstdosebatchno() {
        for (int i=0; i<enrollments.get(0).getEvents().size(); i++){

            String eventDate= enrollments.get(0).getEvents().get(i).getEventDate();
            String orgUnit= enrollments.get(0).getEvents().get(i).getOrgUnit();
            for (int k=0; k< enrollments.get(0).getEvents().get(i).getDataValues().size(); k++){

                String de= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getDataElement();
                String value= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getValue();



                    if(value.contains("DOSE1")){

                        System.out.println("dose 1");

                        if(checkIfTheresBatch(i)){
                            return getBatch(i);
                        }



                    }




            }

        }
        return "-";
    }


    public String getseconddosebatchno() {
        for (int i=0; i<enrollments.get(0).getEvents().size(); i++){

            String eventDate= enrollments.get(0).getEvents().get(i).getEventDate();
            String orgUnit= enrollments.get(0).getEvents().get(i).getOrgUnit();
            for (int k=0; k< enrollments.get(0).getEvents().get(i).getDataValues().size(); k++){

                String de= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getDataElement();
                String value= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getValue();



                if(value.contains("DOSE2")){

                    if(checkIfTheresBatch(i)){
                        return getBatch(i);
                    }


                }




            }

        }
        return "-";
    }


    public String getBatch(int pos){

        System.out.println("eventpos"+ pos);

        for(int k=0; k< enrollments.get(0).getEvents().get(pos).getDataValues().size(); k++){
            String de= enrollments.get(0).getEvents().get(pos).getDataValues().get(k).getDataElement();
            String value= enrollments.get(0).getEvents().get(pos).getDataValues().get(k).getValue();

            if(de.contains("CfIjmVobuul")){

                System.out.println("jkkj"+ value);
                return value;
            }

        }
        return "-";
    }

    public boolean checkIfTheresBatch(int pos){

        System.out.println("eventpos"+ pos);

        for(int k=0; k< enrollments.get(0).getEvents().get(pos).getDataValues().size(); k++){
            String de= enrollments.get(0).getEvents().get(pos).getDataValues().get(k).getDataElement();
            String value= enrollments.get(0).getEvents().get(pos).getDataValues().get(k).getValue();

            if(de.contains("CfIjmVobuul")){

                System.out.println("jkkj"+ value);
                return true;
            }

        }
        return false;
    }
    private String secondDoseVacsiteid() {
        for (int i=0; i<enrollments.get(0).getEvents().size(); i++){



            String eventDate=enrollments.get(0).getEvents().get(i).getEventDate();
            String orgUnit= enrollments.get(0).getEvents().get(i).getOrgUnit();
            for (int k=0; k< enrollments.get(0).getEvents().get(i).getDataValues().size(); k++){

                String de= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getDataElement();
                String value= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getValue();



                if(de.contains("LUIsbsm3okG")){

                    if(value.contains("DOSE2")){


                        if(eventDate!=null){


                            return orgUnit;
                        }


                    }




                }

            }

        }
        return "false";
    }



    public String getSecondDoseDate() throws ParseException {


        for (int i=0; i<enrollments.get(0).getEvents().size(); i++){



            String eventDate=enrollments.get(0).getEvents().get(i).getEventDate();
            for (int k=0; k< enrollments.get(0).getEvents().get(i).getDataValues().size(); k++){

                String de= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getDataElement();
                String value= enrollments.get(0).getEvents().get(i).getDataValues().get(k).getValue();



                if(de.contains("LUIsbsm3okG")){

                    if(value.contains("DOSE2")){


                        if(eventDate!=null){
                            DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);

                            Date date = inputFormat.parse(eventDate);

                            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                            String strDate= formatter.format(date);
                            return strDate;
                        }


                    }




                }

            }

        }
        return "false";

    }



    public String getFirstDoseDate() {
        return firstDoseDate;
    }

    public void setFirstDoseDate(String firstDoseDate) {
        this.firstDoseDate = firstDoseDate;
    }

    public String getVaccinationid() {
        vaccinationid=getVaccinnationID();
        return vaccinationid;
    }


    public String getPhonenumber() {

        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setVaccinationid(String vaccinationid) {
        this.vaccinationid = vaccinationid;
    }


    public String getDob() {
        dob= getDOB();
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getIdtypee() {
        idtypee= getIdType2();
        return idtypee;
    }

    public void setIdtypee(String idtype) {
        this.idtypee = idtype;
    }

    public String getIdnum() {
        idnum=getDocumentId();
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    public TrackedEntityInstance() {
    }
}
