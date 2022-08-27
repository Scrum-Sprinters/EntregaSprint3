package com.ScrumSprinters.proyectoC3.Entidades;
import javax.persistence.*;

@Entity
public class Empleado {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String Nombre;
  private String Correo;
  private String Role;
  private long nit_Empresa;
  
  public ClaseEmpleado(long id, String Nombre, String Correo, String Role, long Empresa) {
        this.id = id;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Role = Role;
        this.nit_Empresa = Empresa;
  }

  public long getId() {
      return id;
  }

  public void setId(long id) {
      this.id = id;
  }

  public String getNombre() {
      return Nombre;
  }

  public void setNombre(String Nombre) {
      this.Nombre = Nombre;
  }

  public String getCorreo() {
      return Correo;
  }

  public void setCorreo(String Correo) {
      this.Correo = Correo;
  }

  public String getRole() {
      return Role;
  }

  public void setRole(String Role) {
      this.Role = Role;
  }

  public long getNit_Empresa() {
      return nit_Empresa;
  }

  public void setNit_Empresa(long nit_Empresa) {
      this.nit_Empresa = nit_Empresa;
  }
}
