package com.ScrumSprinters.proyectoC3.Entidades;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Transaction")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "concept")
    private String concepto;

    @Column(name = "amount")
    private Float monto;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Empresa empresa;
    @CreationTimestamp
    @Column (name = "created_at")
    private Date creado;
    @UpdateTimestamp
    @Column (name = "updated_at")
    private Date modificado;

    public MovimientoDinero() {

    }

     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Date getCreado() {
        return creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public Date getModificado() {
        return modificado;
    }

    public void setModificado(Date modificado) {
        this.modificado = modificado;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "id=" + id +
                ", concepto='" + concepto + '\'' +
                ", monto=" + monto +
                ", empleado=" + empleado +
                ", empresa=" + empresa +
                ", creado=" + creado +
                ", modificado=" + modificado +
                '}';
    }
}