package com.alura.literatura.repository;

import com.alura.literatura.model.Libros;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILibrosRepository extends JpaRepository<Libros, Long> {
    Libros findByTitulo (String titulo); //finBy encontrar por el atributo, en este caso titulo titulo

    List<Libros> findByIdiomasContaining(String idiomas);
}