package com.gitlab.fabricio.castro.agenda.model.repositories;

import com.gitlab.fabricio.castro.agenda.model.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
