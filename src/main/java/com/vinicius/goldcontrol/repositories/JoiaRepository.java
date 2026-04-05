package com.vinicius.goldcontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vinicius.goldcontrol.entities.Joia;

@Repository
public interface JoiaRepository extends JpaRepository<Joia, Long> {
    // Aqui o Spring Data JPA já criou o "Salvar" e o "Buscar" para você!
}