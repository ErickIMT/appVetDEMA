package com.integrador.AppVetDEMA.config.database.entities;

import com.integrador.AppVetDEMA.config.database.entities.types.SalesDocumentType;
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
public class SalesDocument extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 8426556976172277800L;

    @Enumerated(EnumType.STRING)
    private SalesDocumentType salesDocumentType;
    private String salesDocumentNumber;

    @OneToMany(mappedBy = "salesDocument", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Sales> sales;
    private float total;
    private String nameClient;

}
