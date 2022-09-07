package com.ScrumSprinters.proyectoC3.Controladores;

import com.ScrumSprinters.proyectoC3.Entidades.Empleado;
import com.ScrumSprinters.proyectoC3.Servicios.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {
    EmployeeService service;

    public UsersController(){
        this.service = new EmployeeService();
    }


    @GetMapping("/users")
    public List<Empleado> getAllEmpleado(){
        return service.getAllEmployees();
    }

    @PostMapping("/users")
    public String postNewEnterprise(){
        return "Mensaje desde ruta users con metodo POST esto inserta un nuevo usuario";
    }

    @GetMapping("/users/{id}")
    public String getEnterpriseById(){
        return "Mensaje desde ruta users esto devuelve los datos de un user según su Id";
    }

    @PatchMapping("/users/{id}")
    public String updtadeEnterpriseById(){
        return "Esto modifica los datos de un user usando su Id";
    }

    @DeleteMapping("users/{id}")
    public String deleteEnterpriseById(){
        return "Esto borra un user usando su ID";
    }
}
