package com.ScrumSprinters.proyectoC3.Repositories;

import com.ScrumSprinters.proyectoC3.Entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Empleado, Long> {
}
