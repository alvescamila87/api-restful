package com.camila.resttemplate.repository;

import com.camila.resttemplate.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // responsável por interagir com DB
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
