package com.integrador.AppVetDEMA.config.database.jpa;

import com.integrador.AppVetDEMA.config.database.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
