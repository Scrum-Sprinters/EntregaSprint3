package com.ScrumSprinters.proyectoC3.Entidades;
import javax.persistence.*;
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double monto;
    private String usuario;
    private String concepto;
    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    public MovimientoDinero(String usuario, Double monto, String concepto){
        this.usuario = usuario;
        this.monto = monto;
        this.concepto = concepto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}