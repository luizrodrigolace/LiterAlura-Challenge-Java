package com.example.literalura.repository;

import com.example.literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
    Optional<Autor> findByNome(String nome);

    // Consulta JPQL para buscar autores vivos em um ano específico
    @Query("SELECT a FROM Autor a WHERE a.anoNascimento <= :ano AND (a.anoMorte >= :ano OR a.anoMorte IS NULL)")
    List<Autor> findByAnoVivo(int ano);
}