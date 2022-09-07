package com.ScrumSprinters.proyectoC3.Repositories;

import com.ScrumSprinters.proyectoC3.Entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnterpriseRepository extends JpaRepository<Empresa , Long> {
}
