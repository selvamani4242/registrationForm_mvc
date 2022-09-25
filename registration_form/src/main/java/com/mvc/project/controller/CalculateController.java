package com.mvc.project.controller;

import com.mvc.project.dto.Calculateform;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class CalculateController {


    @Controller
    public class PersonController {
        @GetMapping("/calculate")
        public String greetingForm(Model model) {
            Calculateform calculate = new Calculateform();
            model.addAttribute("calc",  calculate);
            return "Calculate";
        }

        @PostMapping("/calculate")
        public String greetingSubmit(@ModelAttribute Calculateform calc, Model model) {
            model.addAttribute("calculate", calc );
            return "calculateresult";
        }
    }
}
