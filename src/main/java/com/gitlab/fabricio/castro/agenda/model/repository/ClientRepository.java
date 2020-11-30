package com.gitlab.fabricio.castro.agenda.model.repository;

import com.gitlab.fabricio.castro.agenda.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
