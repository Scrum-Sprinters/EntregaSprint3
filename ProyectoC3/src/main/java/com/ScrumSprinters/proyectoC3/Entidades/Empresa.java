package com.ScrumSprinters.proyectoC3.Entidades;

//import net.bytebuddy.asm.Advice;
//import javax.persistence.*;

/**Para definir que esta clase es una entidad**/
//@Entity
public class Empresa {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private long nit;
    private String nombre;
    private String direccion;
    private String telefono;

    //private String pais;
    //private String ciudad;
//    private String fechaCreacion;
//    @OneToMany(mappedBy = "empleado")
//    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

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
