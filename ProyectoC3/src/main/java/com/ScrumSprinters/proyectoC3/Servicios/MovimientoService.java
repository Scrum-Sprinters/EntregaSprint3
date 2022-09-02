package com.ScrumSprinters.proyectoC3.Servicios;

import com.ScrumSprinters.proyectoC3.Entidades.Empleado;
import com.ScrumSprinters.proyectoC3.Entidades.EnumRole;
import com.ScrumSprinters.proyectoC3.Entidades.MovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoService {
    MovimientoDinero movimientoDinero;
    @Autowired
    public MovimientoService(){
        this.movimientoDinero = new MovimientoDinero();
        movimientoDinero.setEmpresaNit(10023345);
        movimientoDinero.setConcepto("Creación backend");
        movimientoDinero.setMonto(15000F);
        movimientoDinero.setEmpleadoId(1);
    }

    public MovimientoDinero getMovimientoDinero() {
        return movimientoDinero;
    }

    public List<MovimientoDinero> getAllMovimientoDinero() {
        List<MovimientoDinero> lista = new ArrayList<MovimientoDinero>();
        lista.add(this.getMovimientoDinero());
        return lista;
    }
}
