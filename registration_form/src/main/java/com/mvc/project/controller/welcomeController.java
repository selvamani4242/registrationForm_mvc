package com.mvc.project.controller;

import com.mvc.project.dto.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class welcomeController {

    @GetMapping("/welcomeselva")
    public String greetingForm() {

        return "welcome";
    }

}
