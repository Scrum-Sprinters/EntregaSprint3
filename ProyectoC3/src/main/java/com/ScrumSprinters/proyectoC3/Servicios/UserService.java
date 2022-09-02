package com.ScrumSprinters.proyectoC3.Servicios;

import com.ScrumSprinters.proyectoC3.Entidades.Empleado;
import com.ScrumSprinters.proyectoC3.Entidades.Empresa;
import com.ScrumSprinters.proyectoC3.Entidades.EnumRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    Empleado empleado;
    @Autowired
    public UserService(){
        this.empleado = new Empleado();
        empleado.setNombre("Daniel Castellanos");
        empleado.setCorreo("scrumprinters@gmail.com");
        empleado.setRol(EnumRole.Empleado);
        empleado.setEmpresaNit(10023345);
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public List<Empleado> getAllEmpleado() {
        List<Empleado> lista = new ArrayList<Empleado>();
        lista.add(this.getEmpleado());
        return lista;
    }
}
