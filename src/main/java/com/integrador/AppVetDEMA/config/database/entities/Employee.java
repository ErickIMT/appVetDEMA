package com.integrador.AppVetDEMA.config.database.entities;

import com.integrador.AppVetDEMA.config.database.entities.types.EmployeeType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(schema = "vetapp")
public class Employee extends BasicPersonalData implements Serializable {

    @Serial
    private static final long serialVersionUID = 7787510810045581147L;

    private String profession;
    @Enumerated(EnumType.STRING)
    private EmployeeType employeeType;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date admissionDate;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

}
