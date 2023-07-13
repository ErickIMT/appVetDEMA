package com.integrador.AppVetDEMA.config.database.jpa;

import com.integrador.AppVetDEMA.config.database.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
