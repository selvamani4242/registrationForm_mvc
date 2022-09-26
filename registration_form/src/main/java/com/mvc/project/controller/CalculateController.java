package com.mvc.project.controller;

import com.mvc.project.dto.Calculateform;
import com.mvc.project.dto.Calculateoutput;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculateController {
    @GetMapping("/calculate")
    public String calculateForm(Model model) {
        Calculateform calculate = new Calculateform();
        model.addAttribute("calc", calculate);
        return "Calculate";
    }

    @PostMapping("/calculate")
    public String calculatesubmit(@ModelAttribute Calculateform calc, Model model) {
        int output = calc.getNumber1() + calc.getNumber2();
        model.addAttribute("sumoutput", output);
        return "calculatorview";
    }
}

