package com.alura.literatura.repository;

import com.alura.literatura.model.Autores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAutoresRepository  extends JpaRepository<Autores, Long> {
    Autores findByNameIgnoreCase(String nombre);
    List<Autores> findByFechaDeNacimientoLessThanEqualAndFechaDeFallecimientoGreaterThanEqual(int anoInicial, int anoFinal);
}