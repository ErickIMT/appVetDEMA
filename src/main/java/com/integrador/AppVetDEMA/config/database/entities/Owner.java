package com.integrador.AppVetDEMA.config.database.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(schema = "vetapp")
public class Owner extends BasicPersonalData implements Serializable {

    @Serial
    private static final long serialVersionUID = 8776130740160474598L;

    private String address;

    @JoinTable(name = "owners_pets",
            joinColumns = @JoinColumn(name = "fk_owner", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "FK_pet", nullable = false))
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Pet> pets;

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Appointment> appointments;
}
