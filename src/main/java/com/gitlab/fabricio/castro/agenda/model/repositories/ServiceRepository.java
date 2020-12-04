package com.gitlab.fabricio.castro.agenda.model.repositories;

import com.gitlab.fabricio.castro.agenda.model.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
}
