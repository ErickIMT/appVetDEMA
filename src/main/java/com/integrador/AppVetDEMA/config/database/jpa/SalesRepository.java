package com.integrador.AppVetDEMA.config.database.jpa;

import com.integrador.AppVetDEMA.config.database.entities.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends JpaRepository<Sales,Long> {
}
