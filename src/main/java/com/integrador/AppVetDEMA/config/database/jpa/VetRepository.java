package com.integrador.AppVetDEMA.config.database.jpa;

import com.integrador.AppVetDEMA.config.database.entities.Vet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends JpaRepository<Vet, Long> {
}
