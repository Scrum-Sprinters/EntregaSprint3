package com.ScrumSprinters.proyectoC3.Repositories;

import com.ScrumSprinters.proyectoC3.Entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<MovimientoDinero, Long> {
}
