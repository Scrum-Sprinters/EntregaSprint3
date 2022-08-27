package Entidades;

import net.bytebuddy.asm.Advice;

import javax.persistence.*;

/**Para definir que esta clase es una entidad**/
@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    //Atributos
    private Long id;
    private String nombre;
    private String direccion;
    private int telefono;
    private int nit;
    private String pais;
    private String ciudad;
    private String fechacreacion;
    @OneToMany(mappedBy = "empleado")
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    //Constructor
    public Empresa(Long id, String nombre, String direccion, int telefono, int nit) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
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

    public int getTelefono() {
        return telefono;
    }

    public int getNit() {
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

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
}
