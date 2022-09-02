package com.ScrumSprinters.proyectoC3.Servicios;


import com.ScrumSprinters.proyectoC3.Entidades.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnterpriseService {

    Empresa empresa;
    @Autowired
    public EnterpriseService(){
        this.empresa = new Empresa();
        empresa.setNombre("Tesla");
        empresa.setDireccion("1 Tesla Road Austin, TX 78725");
        empresa.setTelefono("505000");
        empresa.setNit(10023345);
    }

    public Empresa getEmpresa() { //metodo de prueba

        return this.empresa;
    }

    public List<Empresa> getAllEnterprise(){
        List<Empresa> lista = new ArrayList<Empresa>();
        lista.add(this.getEmpresa());
        return lista;

    }
}
