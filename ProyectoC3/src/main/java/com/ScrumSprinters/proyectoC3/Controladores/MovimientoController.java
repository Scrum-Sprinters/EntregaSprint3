package com.ScrumSprinters.proyectoC3.Controladores;

import com.ScrumSprinters.proyectoC3.Entidades.Empresa;
import com.ScrumSprinters.proyectoC3.Servicios.EnterpriseService;
import com.ScrumSprinters.proyectoC3.Servicios.MovimientoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovimientoController {
    MovimientoService service;

    public MovimientoController(){
        this.service = new MovimientoService();
    }

    @PostMapping("/enterprises/{id}/movements")
    public String postNewEnterprise(){
        return "Mensaje desde ruta /enterprises/[id]/movements con metodo POST esto inserta un nuevo Movimiento";
    }

    @GetMapping("/enterprises/{id}/movements")
    public String getEnterpriseById(){
        return "Mensaje desde ruta enterprise esto devuelve los datos de un movimiento según su Id";
    }

    @PatchMapping("/enterprises/{id}/movements")
    public String updtadeEnterpriseById(){
        return "Esto modifica los datos del movimiento su  Id";
    }

    @DeleteMapping("/enterprises/{id}/movements")
    public String deleteEnterpriseById(){
        return "Esto borra un movimiento usando su ID";
    }
}
