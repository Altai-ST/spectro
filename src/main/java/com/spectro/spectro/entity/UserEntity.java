package com.spectro.spectro.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="client")

public class UserEntity {
    @Id
    @Column
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name="name")
    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    @Column(name="email")
    private String email;

    @Getter
    @Setter
    @Column(name="number")
    private String numberphone;

    @Getter
    @Setter
    @Column(name = "password")
    private String password;
}
