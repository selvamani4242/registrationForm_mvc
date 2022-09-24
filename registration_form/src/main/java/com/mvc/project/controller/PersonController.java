package com.mvc.project.controller;

import com.mvc.project.dto.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("registration", new Registration());
        return "registrationForm";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Registration registration, Model model) {
        model.addAttribute("registration", registration);
        return "result";
    }
}
