package com.integrador.AppVetDEMA.config.database.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(schema = "vetapp")
public class Vet extends BasicPersonalData implements Serializable {

    @Serial
    private static final long serialVersionUID = -1138001120319468583L;

    private String speciality;
    private String university;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date graduationDate;

    @OneToMany(mappedBy = "vet", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Appointment> appointments;

}
