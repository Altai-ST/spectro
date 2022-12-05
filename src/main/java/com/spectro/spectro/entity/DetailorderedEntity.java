package com.spectro.spectro.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="detailordered")
@Getter
@Setter
public class DetailorderedEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="detail")
    private String detail;

    @Column(name="amount")
    private String amount;

    @Column(name="status")
    private Boolean status;

    @Column(name="description")
    private String description;
}
