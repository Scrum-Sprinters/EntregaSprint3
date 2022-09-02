package com.ScrumSprinters.proyectoC3.Controladores;

import com.ScrumSprinters.proyectoC3.Entidades.Empresa;
import com.ScrumSprinters.proyectoC3.Servicios.EnterpriseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnterpriseController {

    EnterpriseService service;

    public EnterpriseController(){
        this.service = new EnterpriseService();
    }


    @GetMapping("/enterprise")
    public List<Empresa> getAllEnterprise(){
        return service.getAllEnterprise();
    }

    @PostMapping("/enterprise")
    public String postNewEnterprise(){
        return "Mensaje desde ruta enterprise con metodo POST esto inserta una nueva empresa";
    }

    @GetMapping("/enterprise/{id}")
    public String getEnterpriseById(){
        return "Mensaje desde ruta enterprise esto devuelve los datos de una emperesa según si Id";
    }

    @PatchMapping("/enterprise/{id}")
    public String updtadeEnterpriseById(){
        return "Esto modifica los datos de la empresa usando su  Id";
    }

    @DeleteMapping("enterprise/{id}")
    public String deleteEnterpriseById(){
        return "Esto borra una empresa usando su ID";
    }

}
