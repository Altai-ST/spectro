package com.spectro.spectro.model;

import com.spectro.spectro.entity.PhoneEntity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter

public class Phone {
    private Long id;
    private String phonename;
    private String proizvoditel;
    private String stranaProizvoditel;
    private String tipPamyati;
    private String vstroennayaPamyat;
    private String operativnayaPamyat;
    private String tipEkrana;
    private String chastotaObnovleniya;
    private String razmerEkrana;
    private String razreshenieEkrana;
    private String dopolnitelnyiModulKamer;
    private String osnovnoiModulKamer;
    private String shirokougolnyiModulKamer;
    private String frontalnayaKamera;
    private String dinamic;
    private String vyhodNaushnikov;
    private String razemy;
    private String kolichestvoSIMKart;
    private String tipSIMKart;
    private Boolean nfc;
    private String zashitaOtVlagi;
    private String tipProtsessora;
    private String kolichestvo;
    private BigDecimal prise;
    private String opisanie;

    public static Phone toModel(PhoneEntity entity){
        Phone model = new Phone();
        model.setId(entity.getId());
        model.setPhonename(entity.getPhonename());
        model.setProizvoditel(entity.getProizvoditel());
        model.setStranaProizvoditel(entity.getStranaProizvoditel());
        model.setTipPamyati(entity.getTipPamyati());
        model.setVstroennayaPamyat(entity.getVstroennayaPamyat());
        model.setOperativnayaPamyat(entity.getOperativnayaPamyat());
        model.setTipEkrana(entity.getTipEkrana());
        model.setChastotaObnovleniya(entity.getChastotaObnovleniya());
        model.setRazmerEkrana(entity.getRazmerEkrana());
        model.setRazreshenieEkrana(entity.getRazreshenieEkrana());
        model.setDopolnitelnyiModulKamer(entity.getDopolnitelnyiModulKamer());
        model.setOsnovnoiModulKamer(entity.getOsnovnoiModulKamer());
        model.setShirokougolnyiModulKamer(entity.getShirokougolnyiModulKamer());
        model.setFrontalnayaKamera(entity.getFrontalnayaKamera());
        model.setDinamic(entity.getDinamic());
        model.setVyhodNaushnikov(entity.getVyhodNaushnikov());
        model.setRazemy(entity.getRazemy());
        model.setKolichestvoSIMKart(entity.getKolichestvoSIMKart());
        model.setTipSIMKart(entity.getTipSIMKart());
        model.setNfc(entity.getNfc());
        model.setZashitaOtVlagi(entity.getZashitaOtVlagi());
        model.setTipProtsessora(entity.getTipProtsessora());
        model.setKolichestvo(entity.getKolichestvo());
        model.setPrise(entity.getPrise());
        model.setOpisanie(entity.getOpisanie());
        return model;
    }

}
