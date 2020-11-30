package com.gitlab.fabricio.castro.agenda.model.repository;

import com.gitlab.fabricio.castro.agenda.model.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
}
