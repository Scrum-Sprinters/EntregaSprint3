package com.ScrumSprinters.proyectoC3.Entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Employee")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String nombre;
    @Column(name = "email")
    private String correo;
    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private EnumRole rol;

    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Empresa empresa;

    @Column(name = "created_at")
    private Date creado;

    @Column(name = "updated_at")
    private Date modificado;

    public Empleado() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String Correo) {
        this.correo = Correo;
    }

    public EnumRole getRol() {
        return rol;
    }

    public void setRol(EnumRole Role) {
        this.rol = Role;
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
}
