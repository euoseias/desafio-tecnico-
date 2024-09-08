package com.supera.desafio_tecnico.repository;

//ListRepository.java
import com.supera.desafio_tecnico.model.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<List, Long> {}
