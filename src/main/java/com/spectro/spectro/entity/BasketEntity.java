package com.spectro.spectro.entity;

import com.spectro.spectro.enums.ProductType;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BasketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @JoinColumn
    @ManyToOne
    private UserEntity user;

    @Column
    @Enumerated(EnumType.STRING)
    private ProductType type;

    @Column
    private String model;

    @Column
    private Long productId;

    @Column
    private int amount;

    @Column
    private String image;

    @JoinColumn
    @ManyToOne
    private LaptopEntity laptop;

    @JoinColumn
    @ManyToOne
    private PhoneEntity phone;

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
