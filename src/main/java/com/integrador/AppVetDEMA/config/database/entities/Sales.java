package com.integrador.AppVetDEMA.config.database.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(schema = "vetapp")
public class Sales extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 883785101426775229L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId")
    private Product product;
    private int quantity;
    private float price;
    private float total;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "salesDocumentId")
    private SalesDocument salesDocument;
}
