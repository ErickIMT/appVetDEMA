package com.integrador.AppVetDEMA.config.database.entities;

import com.integrador.AppVetDEMA.config.database.entities.types.DocumentType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@MappedSuperclass
public class BasicPersonalData extends BaseEntity {

    private String name;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private DocumentType documentType;
    private String documentNumber;
    private String phoneNumber;
    private String email;
}
