package com.nphcda.demo.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.nphcda.demo.DTO.*;
import com.nphcda.demo.EventDTO.Event;
import com.nphcda.demo.EventDTO.Events;
import com.nphcda.demo.Service.EntityService;
import com.nphcda.demo.entity.Healthcenter;
import com.nphcda.demo.entity.Rating;
import com.nphcda.demo.entity.VaccineDistribution;
import com.nphcda.demo.kobo.Validator;
import com.nphcda.demo.repo.HealthCenterRepo;
import com.nphcda.demo.repo.RatingRepo;
import com.nphcda.demo.repo.Vaccinedistrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Olalekan Folayan
 */
@Controller
public class PageController {


    @Autowired
    EntityService entityService;

    @Autowired
    Vaccinedistrepo vaccinedistrepo;

    @Autowired
    HealthCenterRepo healthCenterRepo;

    @Value("${dhis-url}")
    private String dhisurl;

    @Value("${dhis-url-update}")
    private String dhisurlforupdate;

    @Value("${kobo-url}")
    private String koboUrl;

    @Value("${kobo-username}")
    private String kobousername;

    @Value("${kobo-password}")
    private String kobopassword;

    @Value("${dhis-username}")
    private String dhisusernam;

    @Value("${dhis-password}")
    private String dhispassword;


    WebClient webClient;


    @Autowired
    RatingRepo ratingRepo;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex(Model model){
        model.addAttribute("verification", new VerificationEntity());
        return "index";
    }



    @RequestMapping(value = "/updatedetails", method = RequestMethod.POST)
    public String homePage(Model model, @ModelAttribute("ver") EditDTO trackedEntityInstance, HttpServletRequest request,HttpSession session) throws ParseException, IOException, URISyntaxException {

        System.out.println("saving");

        TrackedEntityInstance recordDetails = (TrackedEntityInstance) session.getAttribute("verifiedrecord");

        System.out.println("wow"+ recordDetails.getTrackedEntityInstance());
        trackedEntityInstance.setTrackedentitype(recordDetails.getTrackedEntityInstance());
        trackedEntityInstance.setOrgUnit(recordDetails.getOrgUnit());

        System.out.println("the date:"+ trackedEntityInstance.getDob());
            SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
            Date date1=formatter.parse(trackedEntityInstance.getDob());
            final String NEW_FORMAT = "yyyy-MM-dd";
            formatter.applyPattern(NEW_FORMAT);
            trackedEntityInstance.setDob(formatter.format(date1));



        updateToDHIS(trackedEntityInstance);

        return "redirect:/verify?verificationID="+recordDetails.getVaccinnationID();
    }


    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    private void updateToDHIS(EditDTO user) throws URISyntaxException {
        System.out.println("sending");

        webClient = WebClient.builder()
                .defaultHeaders(header -> header.setBasicAuth(dhisusernam, dhispassword))
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .baseUrl(dhisurlforupdate)
                .build();
        // String url = "https://jmeter.e4eweb.space/dhis2/api/trackedEntityInstances.json?ou=s5DPBsdoE8b&program=gWuxRU2yJ1x&ouMode=CAPTURE&filter=izttywqePh2:EQ:NG-RJ89430232GV&fields=*";




        String url2 = dhisurlforupdate+"/dhis2/api/trackedEntityInstances/"+user.getTrackedentitype();


        // create auth credentials




        TrackedEntityInstancem trackedEntityInstance= new TrackedEntityInstancem();
        trackedEntityInstance.setOrgUnit(user.getOrgUnit());
        trackedEntityInstance.setTrackedEntityType("ag6Yk7fwUEe");

        List<Attribute> attributes= new ArrayList<>();



        Attribute typeofid= new Attribute();
        typeofid.setAttribute("OvGXY097Hxt");
        typeofid.setValue(user.getIdtype());

        Attribute documentid= new Attribute();
        documentid.setAttribute("fXHMMrKgEWk");
        documentid.setValue(user.getIdnum());

        Attribute dob2= new Attribute();
        dob2.setAttribute("mAWcalQYYyk");


        dob2.setValue(user.getDob());

        Attribute clientStatus= new Attribute();
        clientStatus.setAttribute("Kmh0uBf0GI5");
        clientStatus.setValue("lk");


        List<Enrollment> enrollments= new ArrayList<>();




        attributes.add(typeofid);
        attributes.add(documentid);
        attributes.add(dob2);
        attributes.add(clientStatus);


        trackedEntityInstance.setAttributes(attributes);

        trackedEntityInstance.setEnrollments(enrollments);




        RestTemplate restTemplate = restTemplateBuilder.basicAuthentication(dhisusernam,dhispassword).build();
        URI uri = new URI(url2);


        System.out.println(url2);
        System.out.println(trackedEntityInstance.toString());
      restTemplate.put(uri, trackedEntityInstance);





        // This method returns filter function which will log request data




    }



        @GetMapping(value = "/getAccess")
    public ResponseEntity<StatusMessage> getwards(@RequestParam(name = "phone", required = true) String phone, HttpSession session) {

        TrackedEntityInstance recordDetails = (TrackedEntityInstance) session.getAttribute("verifiedrecord");
        System.out.println("thisphone"+ phone);
        System.out.println(recordDetails.getDHISPhoneNumber());

        if(phone.equalsIgnoreCase(recordDetails.getDHISPhoneNumber())){
           return ResponseEntity.ok(new StatusMessage("success", "Edit Access Granted "));

        }

        System.out.println("wrong");
       return ResponseEntity.ok(new StatusMessage("error", "Edit Access Denied, phone number does not match!"));

    }


    @RequestMapping(value = "/healthfacility", method = RequestMethod.GET)
    public String showHealthfacilityverification(Model model,  @RequestParam (required = true) String id){


        String barcode= "http://verification.vaccination.gov.ng/health-facility?id="+id;

        if(!healthCenterRepo.existsByOrganizationuit(id)){
            return "InvalidFaclity";

        }
        Healthcenter hc= healthCenterRepo.findByOrganizationuit(id);

        model.addAttribute("healthcenter", hc);



        model.addAttribute("barcode", "https://api.qrserver.com/v1/create-qr-code/?size=200x200&data=" + barcode);

        return "healthfacility";
    }


    @RequestMapping(value = "/rating", method = RequestMethod.GET)
    public String saveFacilityRating(Model model,  @RequestParam (required = true) String id, @RequestParam  (required = false) String show){



        if(!healthCenterRepo.existsByOrganizationuit(id)){
            return "InvalidFaclity";

        }
        Healthcenter hc= healthCenterRepo.findByOrganizationuit(id);

        model.addAttribute("rating", new Rating(hc.getState(), hc.getOrganizationuit(), hc.getHealthCenter()));
        model.addAttribute("healthcenter", hc);

       model.addAttribute("saved", show);

        System.out.println("ghg"+show);


        return "rating";
    }


    @RequestMapping(value = "/rate", method = RequestMethod.POST)
    public String homePage(Model model, @ModelAttribute("rating") Rating rating, HttpServletRequest request) throws ParseException, IOException {

        System.out.println(rating.getComment());
        ratingRepo.save(rating);
        model.addAttribute("saved", true);
        return "redirect:/rating?id=" +rating.getFacilityid()+"&show=true";
    }





        @RequestMapping(value = "/faq", method = RequestMethod.GET)
    public String showFaq(Model model){
        model.addAttribute("verification", new VerificationEntity());
        return "faq";
    }

    @RequestMapping(value = "/verification", method = RequestMethod.POST)
    public ResponseEntity<StatusMessage> doverify(VerificationEntity verificationEntity, Model model){


                System.out.println("hey"+ verificationEntity.getVerificationID());
        return  ResponseEntity.ok(new StatusMessage("success", "Great"));

    }




    @RequestMapping(value = "/verify", method = RequestMethod.GET)
    public String homePage(Model model, @RequestParam (required = false) String id, @RequestParam(required = false) String verificationID, HttpServletRequest request, HttpSession session) throws ParseException, IOException {

        List<TrackedEntityInstance> tracker = null;
        List<Event> events;

        TrackedEntityInstance firstresult = null;


        if (id!=null){


            // Regex to check string is alphanumeric or not.
            String regex = "^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]{8,}$";



            // Compile the ReGex
            Pattern p = Pattern.compile(regex);

            Matcher m = p.matcher(id);

            if(m.matches()){


                String hs=id.substring(6);

                long number = Long.parseLong(hs);

                if (number>0){
                    events = getAllEvents(id);
                    tracker = getAllEntities(events);
                }else{
                    //bad string
                    System.out.println("badd!! "+request.getRemoteAddr() +"-" +id);
                }




            }else{
                //bad string
                System.out.println("badd!! "+request.getRemoteAddr() +"-" +id);
                tracker= Collections.emptyList();
            }



            if (!tracker.isEmpty()) {
                firstresult= tracker.get(0);

                System.out.println("first "+firstresult.getFirstDosePhase());
                System.out.println("second "+ firstresult.getSecondDosePhase());

                model.addAttribute("verifiedrecord", firstresult);

                System.out.println(firstresult.getFirstDoseDate());

                String barcode = tracker.get(0).getQRCode();
                if (!barcode.contains("http")) {
                    model.addAttribute("barcode", "https://via.placeholder.com/200x200.png?text=QR+Not+Linked");
                } else {
                    model.addAttribute("barcode", "https://api.qrserver.com/v1/create-qr-code/?size=200x200&data=" + barcode);

                }

                System.out.println("first "+firstresult.getFirstDosePhase());
                System.out.println("second "+ firstresult.getSecondDosePhase());


                System.out.println("first center "+firstresult.getVaccinnatedFirstDoseCenter());
                System.out.println("second center"+ firstresult.getVaccinatedSecondDoseCenter());

                String firststatecode=firstresult.getVaccinnatedFirstDoseCenter().substring(0,2);
                String secondstatecode =firstresult.getVaccinatedSecondDoseCenter().substring(0,2);

                System.out.println("bae"+ firststatecode);

                System.out.println("vactype"+ firstresult.getVaccationtype());
                String batch = null;
                String batch2= null;

                List<Vaccination> myVaccinations = new ArrayList<>() ;
                System.out.println("hmm"+firstresult.getVaccinnatedFirstDose());






                if(firstresult.getVaccinnatedFirstDose().equalsIgnoreCase("true")&& firstresult.getFirstDosePhase()!=0){
                    VaccineDistribution firstdist= vaccinedistrepo.findByStateCodeAndVaccinetypeAndPhase(firststatecode, firstresult.getVaccationtype(), firstresult.getFirstDosePhase());



                        batch=firstresult.getfirstdosebatchno();

                    myVaccinations.add(new Vaccination(ordinal(1),firstdist.getVaccinename(), firstresult.getFirstDose(), batch));
                }else if(firstresult.getVaccinatedSecondDose().equalsIgnoreCase("true") && firstresult.getFirstDosePhase()==0){
                    myVaccinations.add(new Vaccination(ordinal(1), "-", "-", "-"));
                }


                if(firstresult.getVaccinatedSecondDose().equalsIgnoreCase("true") && firstresult.getSecondDosePhase()!=0){
                    VaccineDistribution seconddist= vaccinedistrepo.findByStateCodeAndVaccinetypeAndPhase(secondstatecode, firstresult.getVaccationtype(), firstresult.getSecondDosePhase());

                       batch2=firstresult.getseconddosebatchno();



                    myVaccinations.add(new Vaccination(ordinal(2),seconddist.getVaccinename(), firstresult.getSecondDoseDate(), batch2));

                }else if(firstresult.getVaccinatedSecondDose().equalsIgnoreCase("true") && firstresult.getSecondDosePhase()==0){
                    myVaccinations.add(new Vaccination(ordinal(2), "-", "-", "-"));
                }









                model.addAttribute("covid", myVaccinations);



                tracker.remove(0);
                Page<TrackedEntityInstance> pagedEntities = entityService.findPaginated(PageRequest.of(1 - 1, 2), tracker);

                int totalPages = pagedEntities.getTotalPages();
                if (totalPages > 0) {
                    List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                            .boxed()
                            .collect(Collectors.toList());
                    model.addAttribute("pageNumbers", pageNumbers);
                }


                session.setAttribute("verifiedrecord", firstresult);


                model.addAttribute("ver", new EditDTO(firstresult.getTrackedEntityInstance(), firstresult.getIdtypee(), firstresult.getVaccinationid(), firstresult.getDocumentId(),firstresult.getDOB(), firstresult.getPhonenumber()));

                model.addAttribute("pagedEntities", pagedEntities);
            }
        }

        else{
            List<TrackedEntity> tracked = verification(verificationID);

             tracker= tracked.get(0).getTrackedEntityInstances();
            if (!tracker.isEmpty()) {

               firstresult= tracker.get(0);

                System.out.println("first "+firstresult.getFirstDosePhase());
                System.out.println("second "+ firstresult.getSecondDosePhase());


                System.out.println("first center "+firstresult.getVaccinnatedFirstDoseCenter());
                System.out.println("second center"+ firstresult.getVaccinatedSecondDoseCenter());

                String firststatecode=firstresult.getVaccinnatedFirstDoseCenter().substring(0,2);
                String secondstatecode =firstresult.getVaccinatedSecondDoseCenter().substring(0,2);

                System.out.println("bae"+ firststatecode);

                System.out.println("vactype"+ firstresult.getVaccationtype());
                String batch = null;
                String batch2= null;

                List<Vaccination> myVaccinations = new ArrayList<>() ;
                System.out.println("hmm"+firstresult.getVaccinnatedFirstDose());
                if(firstresult.getVaccinnatedFirstDose().equalsIgnoreCase("true")&& firstresult.getFirstDosePhase()!=0){


                    System.out.println(firststatecode);
                    System.out.println(firstresult.getVaccationtype());
                    System.out.println(firstresult.getFirstDosePhase());



                    VaccineDistribution firstdist= vaccinedistrepo.findByStateCodeAndVaccinetypeAndPhase(firststatecode, firstresult.getVaccationtype(), firstresult.getFirstDosePhase());


                        batch=firstresult.getfirstdosebatchno();

                    myVaccinations.add(new Vaccination(ordinal(1),firstdist.getVaccinename(), firstresult.getFirstDose(), batch));
                }else if(firstresult.getVaccinatedSecondDose().equalsIgnoreCase("true") && firstresult.getFirstDosePhase()==0){
                    myVaccinations.add(new Vaccination(ordinal(1), "-", "-", "-"));
                }

                if(firstresult.getVaccinatedSecondDose().equalsIgnoreCase("true") && firstresult.getSecondDosePhase()!=0){
                    VaccineDistribution seconddist= vaccinedistrepo.findByStateCodeAndVaccinetypeAndPhase(secondstatecode, firstresult.getVaccationtype(), firstresult.getSecondDosePhase());
                    //for FCT ONLY

                        batch2=firstresult.getseconddosebatchno();


                    myVaccinations.add(new Vaccination(ordinal(2),seconddist.getVaccinename(), firstresult.getSecondDoseDate(), batch2));

                }else if(firstresult.getVaccinatedSecondDose().equalsIgnoreCase("true") && firstresult.getSecondDosePhase()==0){
                    myVaccinations.add(new Vaccination(ordinal(2), "-", "-", "-"));
                }










                model.addAttribute("covid", myVaccinations);
                model.addAttribute("verifiedrecord", firstresult);
                System.out.println("hey"+firstresult.getTrackedEntityInstance());

                System.out.println("vac-id"+ firstresult.getVaccinnationID());

                model.addAttribute("ver",new EditDTO(firstresult.getTrackedEntityInstance(), firstresult.getIdtypee(), firstresult.getVaccinationid(), firstresult.getDocumentId(),firstresult.getDOB(), firstresult.getPhonenumber()));
                firstresult.setVaccinationid(firstresult.getVaccinnationID());

                session.setAttribute("verifiedrecord", firstresult);





                String barcode = firstresult.getQRCode();
                if (!barcode.contains("http")) {
                    model.addAttribute("barcode", "https://via.placeholder.com/200x200.png?text=QR+Not+Linked");
                } else {
                    model.addAttribute("barcode", "https://api.qrserver.com/v1/create-qr-code/?size=200x200&data=" + barcode);

                }

                tracker.remove(0);
                Page<TrackedEntityInstance> pagedEntities = entityService.findPaginated(PageRequest.of(1 - 1, 2), tracker);

                int totalPages = pagedEntities.getTotalPages();
                if (totalPages > 0) {
                    List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                            .boxed()
                            .collect(Collectors.toList());
                    model.addAttribute("pageNumbers", pageNumbers);
                }

                System.out.println(firstresult.toString());


                model.addAttribute("pagedEntities", pagedEntities);
            }
        }




        Validator validateInfo = null;
        if(firstresult!=null){
            validateInfo= getImage(firstresult.getQRCode());
        }


        


        String image="https://via.placeholder.com/200x200.png?text=Validation+Pending";
        String text="";
        if(validateInfo!=null){
            image= validateInfo.getAttachments().get(0).getDownloadSmallUrl();
            text= "© NPHCDA-"+validateInfo.getId().toString();
            // String watermarkkedimg="https://textoverimage.moesif.com/image?image_url="+image+"&text="+text+"&x_align=center&y_align=bottom&text_size=16&text_color=000000ff"+".jpg";
            String watermarkkedimg="https://neutrinoapi.net/image-watermark?image-url="+ image+"&watermark-url=https://res.cloudinary.com/nphcdaict/image/upload/c_scale,w_200/v1633926858/watermark_mvfiyj.png&api-key=YqXLmTK9RGaMBX56EDyYTMwKbjbEiOCSmmGbdiYdeAcxofh6&user-id=leksyde&opacity=30";



            System.out.println("image" +watermarkkedimg);


            if(firstresult.getVaccinatedSecondDose().equalsIgnoreCase("true")){

                model.addAttribute("reddot", true);
            }else if(firstresult.getVaccinnatedFirstDose().equalsIgnoreCase("true") && firstresult.getVaccationtype()=="Johnson" ){
                model.addAttribute("reddot", true);
            }
            else{
                model.addAttribute("reddot", false);
            }
            model.addAttribute("verifiedimg", watermarkkedimg);
        }








        model.addAttribute("validatationinfo", validateInfo);



        model.addAttribute("ver", new EditDTO(firstresult.getTrackedEntityInstance(), firstresult.getIdtypee(), firstresult.getVaccinationid(), firstresult.getDocumentId(),firstresult.getDOB(), firstresult.getPhonenumber()));


        model.addAttribute("verification", new VerificationEntity());

        return "verification";
    }

    @Autowired
    RestTemplate restTemplate;

    private Validator getImage(String QRcode) {
        System.out.println("trying to get image");

        String image="";
        try {
       webClient = WebClient.builder()
                    .defaultHeaders(header -> header.setBasicAuth(kobousername, kobopassword))
                    .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .baseUrl(koboUrl)
                    .build();
            // String url = "https://jmeter.e4eweb.space/dhis2/api/trackedEntityInstances.json?ou=s5DPBsdoE8b&program=gWuxRU2yJ1x&ouMode=CAPTURE&filter=izttywqePh2:EQ:NG-RJ89430232GV&fields=*";

            String url2 = koboUrl;


            // create auth credentials





            String search = "{'query':{\"Use_the_camera_to_scan_a_barcode\":\"firstName\"}}";

            String url = koboUrl+"/api/v1/data/799464?query={search}";

          // Validator validator = restTemplate.getForObject(url2, Validator.class);




            String response =  webClient.get().uri(url2)
                    .retrieve().bodyToMono(String.class).block();


            // get JSON response

           System.out.println(response);



            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(response);

            // Start by checking if this is a list -> the order is important here:
            if (rootNode instanceof ArrayNode) {
                // Read the json as a list:
                System.out.println("here");

                List<Validator> list = mapper.readValue(response, new TypeReference<List<Validator>>(){});



                System.out.println(list);
                for (int i=0; i<list.size(); i++){

                    if(list.get(i)!=null){
                        System.out.println(list.get(i).getBarcode());
                        if(list.get(i).getGeolocation()!=null){


                            if(list.get(i).getBarcode().equals(QRcode)){
                                System.out.println("found it!");



                                return list.get(i);





                            }
                        }
                    }




                }

            } else if (rootNode instanceof JsonNode) {
                // Read the json as a single object:
                System.out.println("hereeee");
             Validator object = mapper.readValue(rootNode.toString(), Validator.class);






            } else {

            }


        } catch (Exception e) {

            e.printStackTrace();
        }

        return null;

    }





    public static String ordinal(int i) {
        String[] suffixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
        switch (i % 100) {
            case 11:
            case 12:
            case 13:
                return i + "th";
            default:
                return i + suffixes[i % 10];

        }
    }

    private List<TrackedEntityInstance> getAllEntities(List<Event> events) {

        List<TrackedEntityInstance> listofpple = new ArrayList<>();


        for (int i = 0; i < events.size(); i++) {
            try {


                webClient = WebClient.builder()
                        .defaultHeaders(header -> header.setBasicAuth(dhisusernam, dhispassword))
                        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                        .baseUrl(dhisurl)
                        .build();
                // String url = "https://jmeter.e4eweb.space/dhis2/api/trackedEntityInstances.json?ou=s5DPBsdoE8b&program=gWuxRU2yJ1x&ouMode=CAPTURE&filter=izttywqePh2:EQ:NG-RJ89430232GV&fields=*";


                String url2 = dhisurl+"/dhis2/api/trackedEntityInstances/" + events.get(i).getTrackedEntityInstance() + ".json?ou=s5DPBsdoE8b&program=gWuxRU2yJ1x&ouMode=CAPTURE&fields=*";


                // create auth credentials


                System.out.println(url2);






                String response =  webClient.get().uri(url2)
                        .retrieve().bodyToMono(String.class).block();


                // get JSON response



                ObjectMapper mapper = new ObjectMapper();
                JsonNode rootNode = mapper.readTree(response);


                // Start by checking if this is a list -> the order is important here:
                if (rootNode instanceof ArrayNode) {
                    // Read the json as a list:
                    TrackedEntity[] objects = mapper.readValue(rootNode.toString(), TrackedEntity[].class);

                } else if (rootNode instanceof JsonNode) {
                    // Read the json as a single object:
                    TrackedEntityInstance object = mapper.readValue(rootNode.toString(), TrackedEntityInstance.class);

                    listofpple.add(object);




                } else {

                }


            } catch (Exception e) {

                e.printStackTrace();
            }
        }

        return listofpple;
    }


    public List<Event> getAllEvents(String id) {

        List<Event> events = new ArrayList<>();


        try {


            webClient = WebClient.builder()
                    .defaultHeaders(header -> header.setBasicAuth(dhisusernam, dhispassword))
                    .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .baseUrl(dhisurl)
                    .build();

            String url2 = dhisurl+"/dhis2/api/events.json?program=gWuxRU2yJ1x&filter=LavUrktwH5D:Like:" + id  +"&page=1&pageSize=2";


            System.out.println(url2);

            String response =  webClient.get().uri(url2)
                    .retrieve().bodyToMono(String.class).block();


            System.out.println(response);


            // get JSON response




            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(response);

            // Start by checking if this is a list -> the order is important here:
            if (rootNode instanceof ArrayNode) {
                // Read the json as a list:
                Events[] objects = mapper.readValue(rootNode.toString(), Events[].class);


            } else if (rootNode instanceof JsonNode) {
                // Read the json as a single object:
                Events object = mapper.readValue(rootNode.toString(), Events.class);

                System.out.println(object.getEvents().isEmpty());
                 events=object.getEvents();








                return events;
            }


        }
        catch (Exception e) {
            e.printStackTrace();

                throw new RuntimeException();

        }


        return events;
    }


    public List<TrackedEntity> verification(String verificationid){





        List<TrackedEntity> tracker = new ArrayList<>();
        try {
            // request url

            webClient = WebClient.builder()
                    .defaultHeaders(header -> header.setBasicAuth(dhisusernam, dhispassword))
                    .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .baseUrl(dhisurl)
                    .build();

            String url = dhisurl+"/dhis2/api/trackedEntityInstances.json?ou=s5DPBsdoE8b&program=gWuxRU2yJ1x&ouMode=CAPTURE&fields=*&filter=izttywqePh2:EQ:" + verificationid;


            System.out.println(url);




            // make a request


            String response =  webClient.get().uri(url)
                    .retrieve().bodyToMono(String.class).block();

            // get JSON response


            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(response);


            // Start by checking if this is a list -> the order is important here:
            if (rootNode instanceof ArrayNode) {
                // Read the json as a list:
                TrackedEntityInstance[] objects = mapper.readValue(rootNode.toString(), TrackedEntityInstance[].class);


            } else if (rootNode instanceof JsonNode) {
                // Read the json as a single object:

                TrackedEntity object = mapper.readValue(rootNode.toString(), TrackedEntity.class);






                tracker.add(object);


                return tracker;


            }


        } catch (Exception e) {
            e.printStackTrace();


        }

        return tracker;

    }
}




