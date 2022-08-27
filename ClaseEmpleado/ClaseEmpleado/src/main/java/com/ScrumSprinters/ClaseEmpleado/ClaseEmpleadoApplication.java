package com.ScrumSprinters.ClaseEmpleado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class ClaseEmpleadoApplication {


	public static void main(String[] args) {
		SpringApplication.run(ClaseEmpleadoApplication.class, args);
		ClaseEmpleado CEA = new ClaseEmpleado(1,"Daniel","dancastell1022@gmail.com","Admin",01);
		System.out.println(CEA.getId());
		System.out.println(CEA.getNombre());
		System.out.println(CEA.getCorreo());
		System.out.println(CEA.getRole());
		System.out.println(CEA.getNit_Empresa());
		System.out.println("Exitoso!");
	}
}
