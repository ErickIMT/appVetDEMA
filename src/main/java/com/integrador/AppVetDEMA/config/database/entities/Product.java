package com.integrador.AppVetDEMA.config.database.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "vetapp")
public class Product extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 4634484053008107371L;

    private String name;
    private float price;
    private int quantity;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Sales> sales;

}
