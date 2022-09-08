package com.ScrumSprinters.proyectoC3.Servicios;

import com.ScrumSprinters.proyectoC3.Entidades.Empresa;
import com.ScrumSprinters.proyectoC3.Entidades.MovimientoDinero;
import com.ScrumSprinters.proyectoC3.Repositories.EnterpriseRepository;
import com.ScrumSprinters.proyectoC3.Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository repository;
    @Autowired
    EnterpriseRepository enterpriseRepository;

    public List<MovimientoDinero> getAllTransaction(Long id_empresa){
        Empresa empresa = enterpriseRepository.findById(id_empresa).get();
        return empresa.getMovimientoDineros();
    }

    public void saveTransaction(Long id_empresa , MovimientoDinero movimientoDinero){
        //TODO: generar fechas de creado y modificado antes de insertar el nuevo registro a DB
        //TODO: agregar Empleado que esté logueado y --empresa del id--

        /*  esto debe ir en try catch por si no hay empresa con ese Id
        Empresa empresa = enterpriseRepository.findById(id_empresa).get();
        movimientoDinero.setEmpresa(empresa);
        */
        repository.save(movimientoDinero);
    }

    //TODO: sin Terminar por falta de claridad en el endpoint /enterprise/{id]/movements/ ?????
    //TODO: no está claro si el id va a llegar en el body o en el path
    public void updateTransactionById(MovimientoDinero movimientoDinero){
        //TODO: cambiar fecha de modificación de la entidad en la DB
        repository.save(movimientoDinero);
    }

    //TODO: sin Terminar por falta de claridad en el endpoint /enterprise/{id]/movements/ ?????
    //TODO: no está claro si el id va a llegar en el body o en el path
    public void deleteTransactionById(Long id){
        repository.deleteById(id);
    }

}
