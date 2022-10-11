
package com.mvc.project.controller;

import com.mvc.project.dto.PersonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PersonTesting<PersonDaoService> {
    @Autowired
    PersonDaoService personDaoService;

    @GetMapping("/testing")
    public String personform(Model model){

        PersonResponse personsdetailoutput = personDaoService.getPersonbyId(1);
        model.addAttribute("personresponseview",  personsdetailoutput );

        return "personresponseview";

    }



}
