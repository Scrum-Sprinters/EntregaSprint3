package com.ScrumSprinters.proyectoC3.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {

    @GetMapping("/error")
    public String error(){
        return "error";
    }

    @GetMapping("/")
    public String index(){
        return "Login";
    }

    @GetMapping("/Principal")
    public String Principal(){
        return "Principal";
    }

    @GetMapping("/Principal/Ver_empresas")
    public String Ver_empresa(){
        return "Ver_empresas";
    }

    @GetMapping("/Principal/Ver_ingresos")
    public String Ver_ingresos(){
        return "Ver_ingresos";
    }

    @GetMapping("/Principal/Ver_usuarios")
    public String Ver_usuarios(){
        return "Ver_usuarios";
    }

    @GetMapping("/Principal/Ver_ingresos/Nuevo_ingreso")
    public String Nuevo_ingreso(){
        return "Nuevo_ingreso";
    }

    @GetMapping("/Principal/Ver_usuarios/Nuevo_usuario")
    public String Nuevo_usuario(){
        return "Nuevo_usuario";
    }

    @GetMapping("/Principal/Ver_empresas/Nueva_empresa")
    public String Nueva_empresa(){
        return "Nueva_empresa";
    }
}
