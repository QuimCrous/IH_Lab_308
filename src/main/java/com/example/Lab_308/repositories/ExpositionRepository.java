package com.example.Lab_308.repositories;

import com.example.Lab_308.models.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpositionRepository extends JpaRepository<Exposition, Long> {
}
