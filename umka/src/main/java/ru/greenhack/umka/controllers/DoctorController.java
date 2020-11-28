package ru.greenhack.umka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorController {

    @GetMapping("/doctor")
    public String doctorPage() {
        return "doctor";
    }

    @GetMapping("/doctor/createNewPatient")
    public String addNewPage() {
        return "newPatient";
    }
}
