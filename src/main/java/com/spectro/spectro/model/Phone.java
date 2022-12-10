package com.spectro.spectro.model;

import com.spectro.spectro.entity.PhoneEntity;

import java.math.BigDecimal;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhonename() {
        return phonename;
    }

    public void setPhonename(String phonename) {
        this.phonename = phonename;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public String getStranaProizvoditel() {
        return stranaProizvoditel;
    }

    public void setStranaProizvoditel(String stranaProizvoditel) {
        this.stranaProizvoditel = stranaProizvoditel;
    }

    public String getTipPamyati() {
        return tipPamyati;
    }

    public void setTipPamyati(String tipPamyati) {
        this.tipPamyati = tipPamyati;
    }

    public String getVstroennayaPamyat() {
        return vstroennayaPamyat;
    }

    public void setVstroennayaPamyat(String vstroennayaPamyat) {
        this.vstroennayaPamyat = vstroennayaPamyat;
    }

    public String getOperativnayaPamyat() {
        return operativnayaPamyat;
    }

    public void setOperativnayaPamyat(String operativnayaPamyat) {
        this.operativnayaPamyat = operativnayaPamyat;
    }

    public String getTipEkrana() {
        return tipEkrana;
    }

    public void setTipEkrana(String tipEkrana) {
        this.tipEkrana = tipEkrana;
    }

    public String getChastotaObnovleniya() {
        return chastotaObnovleniya;
    }

    public void setChastotaObnovleniya(String chastotaObnovleniya) {
        this.chastotaObnovleniya = chastotaObnovleniya;
    }

    public String getRazmerEkrana() {
        return razmerEkrana;
    }

    public void setRazmerEkrana(String razmerEkrana) {
        this.razmerEkrana = razmerEkrana;
    }

    public String getRazreshenieEkrana() {
        return razreshenieEkrana;
    }

    public void setRazreshenieEkrana(String razreshenieEkrana) {
        this.razreshenieEkrana = razreshenieEkrana;
    }

    public String getDopolnitelnyiModulKamer() {
        return dopolnitelnyiModulKamer;
    }

    public void setDopolnitelnyiModulKamer(String dopolnitelnyiModulKamer) {
        this.dopolnitelnyiModulKamer = dopolnitelnyiModulKamer;
    }

    public String getOsnovnoiModulKamer() {
        return osnovnoiModulKamer;
    }

    public void setOsnovnoiModulKamer(String osnovnoiModulKamer) {
        this.osnovnoiModulKamer = osnovnoiModulKamer;
    }

    public String getShirokougolnyiModulKamer() {
        return shirokougolnyiModulKamer;
    }

    public void setShirokougolnyiModulKamer(String shirokougolnyiModulKamer) {
        this.shirokougolnyiModulKamer = shirokougolnyiModulKamer;
    }

    public String getFrontalnayaKamera() {
        return frontalnayaKamera;
    }

    public void setFrontalnayaKamera(String frontalnayaKamera) {
        this.frontalnayaKamera = frontalnayaKamera;
    }

    public String getDinamic() {
        return dinamic;
    }

    public void setDinamic(String dinamic) {
        this.dinamic = dinamic;
    }

    public String getVyhodNaushnikov() {
        return vyhodNaushnikov;
    }

    public void setVyhodNaushnikov(String vyhodNaushnikov) {
        this.vyhodNaushnikov = vyhodNaushnikov;
    }

    public String getRazemy() {
        return razemy;
    }

    public void setRazemy(String razemy) {
        this.razemy = razemy;
    }

    public String getKolichestvoSIMKart() {
        return kolichestvoSIMKart;
    }

    public void setKolichestvoSIMKart(String kolichestvoSIMKart) {
        this.kolichestvoSIMKart = kolichestvoSIMKart;
    }

    public String getTipSIMKart() {
        return tipSIMKart;
    }

    public void setTipSIMKart(String tipSIMKart) {
        this.tipSIMKart = tipSIMKart;
    }

    public Boolean getNfc() {
        return nfc;
    }

    public void setNfc(Boolean nfc) {
        this.nfc = nfc;
    }

    public String getZashitaOtVlagi() {
        return zashitaOtVlagi;
    }

    public void setZashitaOtVlagi(String zashitaOtVlagi) {
        this.zashitaOtVlagi = zashitaOtVlagi;
    }

    public String getTipProtsessora() {
        return tipProtsessora;
    }

    public void setTipProtsessora(String tipProtsessora) {
        this.tipProtsessora = tipProtsessora;
    }

    public String getKolichestvo() {
        return kolichestvo;
    }

    public void setKolichestvo(String kolichestvo) {
        this.kolichestvo = kolichestvo;
    }

    public BigDecimal getPrise() {
        return prise;
    }

    public void setPrise(BigDecimal prise) {
        this.prise = prise;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }
}
