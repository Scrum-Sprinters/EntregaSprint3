package com.ScrumSprinters.proyectoC3.Entidades;
//import javax.persistence.*;
//@Entity
public class Empleado {
//  @Id
//  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String nombre;
  private String correo;
  //private String Role;
    private EnumRole rol;
  private long empresa_nit;
  
  //public Empleado(long id, String Nombre, String Correo, String Role, long Empresa) {
  public Empleado(long id, String Nombre, String Correo, EnumRole Role, long Empresa) {
        this.id = id;
        this.nombre = Nombre;
        this.correo = Correo;
        this.rol = Role;

        this.empresa_nit = Empresa;
  }

  public Empleado(){
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


  /*
  public String getRole() {
      return Role;
  }

  public void setRole(String Role) {
      this.Role = Role;
  }
*/
  public EnumRole getRol() {
      return rol;
  }

    public void setRol(EnumRole Role) {
        this.rol = Role;
    }


  public long getEmpresaNit() {
      return empresa_nit;
  }

  public void setEmpresaNit(long empresa_nit) {
      this.empresa_nit = empresa_nit;
  }
}
