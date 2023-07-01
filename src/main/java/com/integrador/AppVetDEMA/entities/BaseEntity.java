package com.integrador.AppVetDEMA.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "createdBy", updatable = false)
    @CreatedBy
    private String createdBy;

    @Column(name = "createdOn", updatable = false)
    @CreatedDate
    private Date createdOn;

    @Column(name = "updatedBy", updatable = false)
    @LastModifiedBy
    private String updatedBy;

    @Column(name = "updatedOn", updatable = false)
    @LastModifiedDate
    private Date updatedOn;

}
