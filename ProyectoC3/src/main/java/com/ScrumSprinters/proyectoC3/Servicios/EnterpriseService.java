package com.ScrumSprinters.proyectoC3.Servicios;


import com.ScrumSprinters.proyectoC3.Entidades.Empresa;
import com.ScrumSprinters.proyectoC3.Repositories.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnterpriseService {

    @Autowired
    EnterpriseRepository repository;

    public EnterpriseService() {
    }

    public void saveEnterprise(Empresa empresa){ //metodo post /enterprises
        //TODO: Generar las fechas para creado y modificado usar metodos empresa.setCreado() para escribir la informacion y luego salvarla a BD
        repository.save(empresa);
    }

    public List<Empresa> getAllEnterprise(){ //metodo get /enterprises
        return repository.findAll();
    }

    public Empresa getEnterpriseById(Long id){ //metodo get /enterprises/{id}
        var empresa = repository.findById(id);
        return empresa.get();
    }
    public void updateEnterpriseById(Empresa empresa){ //metodo patch /enterprises/{id}
        repository.save(empresa); //TODO: validar que el objeto tiene el id
    }

    public void deleteEnterpriseById(Long id){
        repository.deleteById(id);
    }

}
