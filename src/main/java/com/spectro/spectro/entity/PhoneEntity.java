package com.spectro.spectro.entity;


import javax.persistence.*;

@Entity
public class PhoneEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
