package com.spectro.spectro.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="detailordered")

public class DetailorderedEntity {
    @Id
    @Column
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name="detail")
    private String detail;

    @Getter
    @Setter
    @Column(name="amount")
    private String amount;

    @Getter
    @Setter
    @Column(name="status")
    private Boolean status;

    @Getter
    @Setter
    @Column(name="description")
    private String description;
}
