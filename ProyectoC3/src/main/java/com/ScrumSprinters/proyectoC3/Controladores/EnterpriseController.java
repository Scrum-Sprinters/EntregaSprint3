package com.ScrumSprinters.proyectoC3.Controladores;

import com.ScrumSprinters.proyectoC3.Entidades.Empresa;
import com.ScrumSprinters.proyectoC3.Servicios.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnterpriseController {

    @Autowired
    EnterpriseService service;

    public EnterpriseController(){
    }

    @GetMapping("/enterprises")
    public List<Empresa> getAllEnterprise(){
        return service.getAllEnterprise();
    }
    @PostMapping("/enterprises")
    public String saveEnterprise(@RequestBody Empresa empresa){
        service.saveEnterprise(empresa);
        return "Se ingresa empresa: " + empresa.toString();
    }

    @GetMapping("/enterprises/{id}")
    public Empresa getEnterpriseById(@PathVariable Long id){
        return service.getEnterpriseById(id);
    }

    @PatchMapping("/enterprises/{id}")
    public String updtadeEnterpriseById(@PathVariable Long id , @RequestBody Empresa empresa){
        empresa.setId(id);
        service.updateEnterpriseById(empresa);
        return "Se llama modificar empresa con id: " + id.toString();
    }

    @DeleteMapping("enterprises/{id}")
    public String deleteEnterpriseById(@PathVariable Long id){
        service.deleteEnterpriseById(id);
        return "Se llama borrar empresa con id: " + id.toString();
    }



}
