package com.ScrumSprinters.proyectoC3.Entidades;

import net.bytebuddy.asm.Advice;
import javax.persistence.*;

@Entity
@Table(name="Enterprise")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="nit")
    private long nit;
    @Column(name="nombre")
    private String nombre;
    @Column(name="direccion")
    private String direccion;
    @Column(name="telefono")
    private String telefono;

    //private String pais;
    //private String ciudad;
//    private String fechaCreacion;
    //@OneToMany(mappedBy = "empleado")
    //@JoinColumn(name = "empleado_id")
    //private Empleado empleado;

    //Constructor
    public Empresa(Long id, String nombre, String direccion, String telefono, long nit) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    public Empresa() {

    }

    //Metodo

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
}
