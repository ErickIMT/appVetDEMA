package com.integrador.AppVetDEMA.config.database.entities;

import com.integrador.AppVetDEMA.config.database.entities.types.UserType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(schema = "vetapp")
public class User extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -3650489338641478939L;

    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserType userType;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Employee employee;
}
