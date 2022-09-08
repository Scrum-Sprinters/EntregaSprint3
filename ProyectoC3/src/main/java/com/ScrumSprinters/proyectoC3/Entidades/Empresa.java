package com.ScrumSprinters.proyectoC3.Entidades;

import net.bytebuddy.asm.Advice;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Enterprise")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="name" , unique = true)
    private String nombre;
    @Column(name="document", unique = true)
    private long nit;
    @Column(name="phone")
    private String telefono;
    @Column(name="address")
    private String direccion;

    @OneToMany(mappedBy = "empresa")
    private List<Empleado> empleados;

    @OneToMany(mappedBy = "empresa")
    private List<MovimientoDinero> movimientoDineros;

    @Column (name = "created_at")
    private Date creado;

    @Column (name = "updated_at")
    private Date modificado;

    //Constructor

    public Empresa(Long id, long nit, String nombre, String direccion, String telefono, Date creado, Date modificado) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.creado = creado;
        this.modificado = modificado;
    }

    public Empresa() {

    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public Long getNit() {
        return nit;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNit(long nit) {
        this.nit = nit;
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

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<MovimientoDinero> getMovimientoDineros() {
        return movimientoDineros;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nit=" + nit +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", empleados=" + empleados +
                ", movimientoDineros=" + movimientoDineros +
                ", creado=" + creado +
                ", modificado=" + modificado +
                '}';
    }
}
