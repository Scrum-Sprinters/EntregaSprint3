package com.ScrumSprinters.proyectoC3.Controladores;

import com.ScrumSprinters.proyectoC3.Entidades.MovimientoDinero;
import com.ScrumSprinters.proyectoC3.Servicios.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {

    @Autowired
    TransactionService service;

    public TransactionController(){
    }

    //TODO: Conectar con el servicio
    @PostMapping("/enterprises/{id}/movements")
    public String postNewTransaction(@PathVariable Long id){
        return "Se llama agregar movimiento para la empresa con Id: " + id.toString();
    }

    //TODO: Conectar con el servicio
    @GetMapping("/enterprises/{id}/movements")
    public String getTransactionById(@PathVariable Long id){
        return "Se llama obtener movimientos para la empresa con Id: " + id.toString();
    }

    //TODO: Conectar con el servicio
    @PatchMapping("/enterprises/{id}/movements")
    public String updtadeTransaction(@PathVariable Long id){
        return "Se llama modificar movimiento para la empresa con Id" + id.toString();
    }

    //TODO: Conectar con el servicio
    @DeleteMapping("/enterprises/{id}/movements")
    public String deleteTransaction(@PathVariable Long id){
        return "Se llama borrar movimiento para la empresa con Id" + id.toString();
    }

    //Implementacion futura con conexion a base de datos
    /*
    @PostMapping("/enterprises/{id}/movements")
    public String postNewTransaction(@PathVariable Long id_empresa ,  @RequestBody MovimientoDinero movimientoDinero){
        service.saveTransaction(id_empresa, movimientoDinero);
        return "Mensaje desde ruta /enterprises/[id]/movements con metodo POST esto inserta un nuevo Movimiento";
    }

    @GetMapping("/enterprises/{id}/movements")
    public List<MovimientoDinero> getTransactionById(@PathVariable Long id_empresa){
        return service.getAllTransaction(id_empresa);
    }
*/

}
