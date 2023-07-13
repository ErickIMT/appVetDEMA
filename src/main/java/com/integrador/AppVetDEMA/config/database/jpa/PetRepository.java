package com.integrador.AppVetDEMA.config.database.jpa;

import com.integrador.AppVetDEMA.config.database.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
}
