package com.spectro.spectro.service;

import com.spectro.spectro.entity.PhoneEntity;
import com.spectro.spectro.exception.UserAlreadyExistException;
import com.spectro.spectro.exception.UserNotFoundException;
import com.spectro.spectro.model.Phone;
import com.spectro.spectro.repository.PhoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneService {
    @Autowired
    private PhoneRepo phoneRepo;
    public PhoneEntity register(PhoneEntity phone) throws UserAlreadyExistException {
        if(phoneRepo.findByPhonename(phone.getPhonename()) != null){
            throw new UserAlreadyExistException("Такой телефон уже есть");
        }
//        else if(phoneRepo.findByEmail(user.getEmail())!=null){
//            throw new UserAlreadyExistException("Такой email уже занят");
//        }
//        else if(userRepo.findByNumberphone(user.getNumberphone())!=null){
//            throw new UserAlreadyExistException("Такой номер уже занят");
//        }
        return phoneRepo.save(phone);
    }

    public PhoneEntity update(PhoneEntity phone, Long id) throws UserNotFoundException {
        PhoneEntity phones = phoneRepo.findById(id).get();
        if(phones == null){
            throw new UserNotFoundException("Пользователь не найден");
        }
        phones.setPhonename(phone.getPhonename());
        phones.setProizvoditel(phone.getProizvoditel());
        phones.setStranaProizvoditel(phone.getStranaProizvoditel());
        phones.setTipPamyati(phone.getTipPamyati());
        phones.setVstroennayaPamyat(phone.getVstroennayaPamyat());
        phones.setOperativnayaPamyat(phone.getOperativnayaPamyat());
        phones.setTipEkrana(phone.getTipEkrana());
        phones.setChastotaObnovleniya(phone.getChastotaObnovleniya());
        phones.setRazmerEkrana(phone.getRazmerEkrana());
        phones.setRazreshenieEkrana(phone.getRazreshenieEkrana());
        phones.setDopolnitelnyiModulKamer(phone.getDopolnitelnyiModulKamer());
        phones.setOsnovnoiModulKamer(phone.getOsnovnoiModulKamer());
        phones.setShirokougolnyiModulKamer(phone.getShirokougolnyiModulKamer());
        phones.setFrontalnayaKamera(phone.getFrontalnayaKamera());
        phones.setDinamic(phone.getDinamic());
        phones.setVyhodNaushnikov(phone.getVyhodNaushnikov());
        phones.setRazemy(phone.getRazemy());
        phones.setKolichestvoSIMKart(phone.getKolichestvoSIMKart());
        phones.setTipSIMKart(phone.getTipSIMKart());
        phones.setNfc(phone.getNfc());
        phones.setZashitaOtVlagi(phone.getZashitaOtVlagi());
        phones.setTipProtsessora(phone.getTipProtsessora());
        phones.setKolichestvo(phone.getKolichestvo());
        phones.setPrise(phone.getPrise());
        phones.setOpisanie(phone.getOpisanie());
        return phoneRepo.save(phones);
    }

    public Phone getOne(Long id) throws UserNotFoundException{
        PhoneEntity phone = phoneRepo.findById(id).get();
        if(phone == null){
            throw new UserNotFoundException("Телефон не найден");
        }
        return Phone.toModel(phone);
    }

    public Long delete(Long id){
        phoneRepo.deleteById(id);
        return id;
    }
}
