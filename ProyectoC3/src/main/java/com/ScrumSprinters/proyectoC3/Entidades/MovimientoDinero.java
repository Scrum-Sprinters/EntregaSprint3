package com.ScrumSprinters.proyectoC3.Entidades;
//import javax.persistence.*;
public class MovimientoDinero {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Float monto;
    private long empleado_id;
    private long empresa_nit;
    private String concepto;
//    @ManyToOne
//    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    public MovimientoDinero(long empresa_nit, long empleado_id, Float monto, String concepto){
        this.empresa_nit = empresa_nit;
        this.empleado_id = empleado_id;
        this.monto = monto;
        this.concepto = concepto;
    }

    public MovimientoDinero() {

    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public long getEmpleadoId() {
        return empleado_id;
    }

    public void setEmpleadoId(long empleado_id) {
        this.empleado_id = empleado_id;
    }

    public long getEmpresaNit() {
        return empresa_nit;
    }

    public void setEmpresaNit(long empresa_nit) {
        this.empresa_nit = empresa_nit;
    }
}