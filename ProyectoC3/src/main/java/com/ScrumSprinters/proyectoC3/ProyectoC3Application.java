package com.ScrumSprinters.proyectoC3;

import com.ScrumSprinters.proyectoC3.Entidades.Empleado;
import com.ScrumSprinters.proyectoC3.Entidades.Empresa;
import com.ScrumSprinters.proyectoC3.Entidades.EnumRole;
import com.ScrumSprinters.proyectoC3.Entidades.MovimientoDinero;

//@SpringBootApplication
public class ProyectoC3Application {

	public static void main(String[] args) {

		//SpringApplication.run(ProyectoC3Application.class, args);

		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Elon Musk");
		empleado1.setCorreo("elon@tesla.com");
		empleado1.setId(19283746);
		empleado1.setRol(EnumRole.Administrador);
		empleado1.setEmpresaNit(10023345);

		System.out.println("------------- EMPLEADO --------------------");
		System.out.println("Nombre: "+ empleado1.getNombre());
		System.out.println("Correo: " + empleado1.getCorreo());
		System.out.println("Id: " + empleado1.getId());
		System.out.println("Rol: " + empleado1.getRol().toString());
		System.out.println("Nit Empresa: " + empleado1.getEmpresaNit());


		Empresa empresa1 = new Empresa();
		empresa1.setNombre("Tesla");
		empresa1.setDireccion("1 Tesla Road Austin, TX 78725");
		empresa1.setTelefono("505000");
		empresa1.setNit(10023345);
		System.out.println("\n");
		System.out.println("------------- EMPRESA ---------------------");
		System.out.println("Nombre: " + empresa1.getNombre());
		System.out.println("Dirección: " + empresa1.getDireccion());
		System.out.println("Telefono: " + empresa1.getTelefono());
		System.out.println("Nit: " + empresa1.getNit());


		MovimientoDinero movimiento1 = new MovimientoDinero();
		movimiento1.setMonto(-44000000000f);
		movimiento1.setConcepto("Compra de Twitter");
		movimiento1.setEmpleadoId(19283746);
		movimiento1.setEmpresaNit(10023345);

		System.out.println("\n");
		System.out.println("------- MOVIMIENTO DINERO ----------------");
		System.out.println("Monto: " + movimiento1.getMonto());
		System.out.println("Concepto: " + movimiento1.getConcepto());
		System.out.println("Empleado: " + movimiento1.getEmpleadoId());
		System.out.println("Empresa: " + movimiento1.getEmpresaNit());


	}

}
