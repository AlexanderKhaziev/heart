package ru.greenhack.umka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientsController {

    @GetMapping("/doctor/patients/1")
    public String patient(Model model) {
        model.addAttribute("fio", "Петров Иннокентий Иванович");
        return "patientInfo";
    }

}
