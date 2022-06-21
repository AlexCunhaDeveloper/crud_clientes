package com.clientes.crud.clintes.repositories;

import com.clientes.crud.clintes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositoy extends JpaRepository<Client, Long> {
}
