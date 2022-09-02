package com.ScrumSprinters.proyectoC3.Controladores;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController {

    @GetMapping("/")
    public String getHomePage(){
        return "Home Page";
    }
    @GetMapping("/error")
    public String getErrorPage(){
        return "Error Page desde ruta";
    }
}
