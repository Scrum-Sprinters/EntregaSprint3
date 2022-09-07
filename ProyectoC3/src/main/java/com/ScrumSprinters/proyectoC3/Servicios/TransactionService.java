package com.ScrumSprinters.proyectoC3.Servicios;

import com.ScrumSprinters.proyectoC3.Entidades.MovimientoDinero;
import com.ScrumSprinters.proyectoC3.Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository repository;
    //TODO: generar fechas de creado y modificado antes de insertar el nuevo registro a DB
    public List<MovimientoDinero> getAllTransaction(){
        return repository.findAll();
    }

    public void saveTransaction(MovimientoDinero movimientoDinero){
        repository.save(movimientoDinero);
    }
    public void updateTransactionById(MovimientoDinero movimientoDinero){
        repository.save(movimientoDinero);
    }
    public void deleteTransactionById(Long id){
        repository.deleteById(id);
    }



}
