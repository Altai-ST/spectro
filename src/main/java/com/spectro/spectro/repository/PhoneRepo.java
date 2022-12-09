package com.spectro.spectro.repository;

import com.spectro.spectro.entity.PhoneEntity;
import org.springframework.data.repository.CrudRepository;

public interface PhoneRepo extends CrudRepository<PhoneEntity, Long> {
    PhoneEntity findByPhonename(String phonename);
    PhoneEntity findByProizvoditel(String proizvoditel);
    PhoneEntity findByStranaProizvoditel(String stranaProizvoditel);
    PhoneEntity findByTipPamyati(String tipPamyati);
    PhoneEntity findByVstroennayaPamyat(String vstroennayaPamyat);
    PhoneEntity findByOperativnayaPamyat(String operativnayaPamyat);
    PhoneEntity findByTipEkrana(String tipEkrana);
    PhoneEntity findByChastotaObnovleniya(String chastotaObnovleniya);
    PhoneEntity findByRazmerEkrana(String razmerEkrana);
    PhoneEntity findByRazreshenieEkrana(String razreshenieEkrana);
    PhoneEntity findByDopolnitelnyiModulKamer(String dopolnitelnyiModulKamer);
    PhoneEntity findByOsnovnoiModulKamer(String osnovnoiModulKamer);
    PhoneEntity findByShirokougolnyiModulKamer(String shirokougolnyiModulKamer);
    PhoneEntity findByFrontalnayaKamera(String frontalnayaKamera);
    PhoneEntity findByDinamic(String dinamic);
    PhoneEntity findByVyhodNaushnikov(String vyhodNaushnikov);
    PhoneEntity findByRazemy(String razemy);
//    PhoneEntity findByKolichestvoSIMKart();
}