package com.mvc.project.controller;

import com.mvc.project.dto.PersonDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class PersonDetailsController {

    @GetMapping("/persondetail")
    public String persondetailsform(Model model){
        PersonDetail persondetails = new PersonDetail();
        model.addAttribute("showpersondetail", persondetails);
        return  "persondetailsform";
    }

    @PostMapping("/ persondetail")
    public String persondetailsubmit(@ModelAttribute PersonDetail showpersondetail, Model model){
        ArrayList<PersonDetail> personDetails = new ArrayList<>();
        PersonDetail personDetailoutput = personDetails.get(0);
        model.addAttribute("viewpersondetailoutput", personDetailoutput);
        return "persondetailsview";




    }



}
