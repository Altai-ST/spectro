package com.spectro.spectro.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class PhoneEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="phonename")
    private String phonename;

    @Column(name="proizvoditel")
    private String proizvoditel;

    @Column(name="stranaProizvoditel")
    private String stranaProizvoditel;

    @Column(name="tipPamyati")
    private String tipPamyati;

    @Column(name="vstroennayaPamyat")
    private String vstroennayaPamyat;

    @Column(name="operativnayaPamyat")
    private String operativnayaPamyat;

    @Column(name="tipEkrana")
    private String tipEkrana;

    @Column(name="chastotaObnovleniya")
    private String chastotaObnovleniya;

    @Column(name="razmerEkrana")
    private String razmerEkrana;

    @Column(name="razreshenieEkrana")
    private String razreshenieEkrana;

    @Column(name="dopolnitelnyiModulKamer")
    private String dopolnitelnyiModulKamer;

    @Column(name="osnovnoiModulKamer")
    private String osnovnoiModulKamer;

    @Column(name="shirokougolnyiModulKamer")
    private String shirokougolnyiModulKamer;

    @Column(name="frontalnayaKamera")
    private String frontalnayaKamera;

    @Column(name="dinamic")
    private String dinamic;

    @Column(name="vyhodNaushnikov")
    private String vyhodNaushnikov;

    @Column(name="razemy")
    private String razemy;

    @Column(name="kolichestvoSIMKart")
    private String kolichestvoSIMKart;

    @Column(name="tipSIMKart")
    private String tipSIMKart;

    @Column(name="nfc")
    private Boolean nfc;

    @Column(name="zashitaOtVlagi")
    private String zashitaOtVlagi;

    @Column(name="tipProtsessora")
    private String tipProtsessora;

    @Column(name="kolichestvo")
    private String kolichestvo;

    @Column(name="prise")
    private BigDecimal prise;

    @Column(name="opisanie")
    private String opisanie;
}
