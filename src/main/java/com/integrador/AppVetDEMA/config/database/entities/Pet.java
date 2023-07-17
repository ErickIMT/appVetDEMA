package com.integrador.AppVetDEMA.config.database.entities;

import com.integrador.AppVetDEMA.config.database.entities.types.TypePet;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(schema = "vetapp")
public class Pet extends BaseEntity {

    private String name;
    private Date birthDay;
    private TypePet typePet;
    private String race;

    @ManyToMany(mappedBy = "pets")
    private List<Owner> owners;

    @OneToMany(mappedBy = "pet", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Appointment> appointments;
}
