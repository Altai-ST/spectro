package com.spectro.spectro.service;

import com.spectro.spectro.entity.LaptopEntity;
import com.spectro.spectro.enums.LaptopEnum;
import com.spectro.spectro.exception.UserNotFoundException;
import com.spectro.spectro.model.LaptopPage;
import com.spectro.spectro.model.LaptopSearchCriteria;
import com.spectro.spectro.repository.LaptopCriteriaRepo;
import com.spectro.spectro.repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepo laptopRepo;
    @Autowired
    private LaptopCriteriaRepo laptopCriteriaRepo;

    public void save(LaptopEntity laptop){
        if(laptopRepo.findByModel(laptop.getModel())==null)this.laptopRepo.save(laptop);
    }

    public void update(LaptopEntity laptop) throws UserNotFoundException {
        LaptopEntity laptop1 = laptopRepo.findByModel(laptop.getModel());
        if(laptopRepo.findByModel(laptop.getModel())!=null){
            laptop1.setAmount(laptop.getAmount());
            laptop1.setCamera(laptop.getCamera());
            laptop1.setConnectors(laptop.getConnectors());
            laptop1.setDescription(laptop.getDescription());
            laptop1.setDimensions(laptop.getDimensions());
            laptop1.setHeadphoneJack(laptop.getHeadphoneJack());
            laptop1.setHousingMaterial(laptop.getHousingMaterial());
            laptop1.setMemory(laptop.getMemory());
            laptop1.setManufacturer(laptop.getManufacturer());
            laptop1.setModel(laptop.getModel());
            laptop1.setNumberOfCores(laptop.getNumberOfCores());
            laptop1.setOS(laptop.getOS());
            laptop1.setPrice(laptop.getPrice());
            laptop1.setProcessorType(laptop.getProcessorType());
            laptop1.setProducingCountry(laptop.getProducingCountry());
            laptop1.setRAM(laptop.getRAM());
            laptop1.setSpeaker(laptop.getSpeaker());
            laptop1.setScreenSize(laptop.getScreenSize());
            laptop1.setScreenResolution(laptop.getScreenResolution());
            laptop1.setVideoCard(laptop.getVideoCard());
            laptop1.setStatus(laptop.getStatus());
            laptopRepo.save(laptop1);
        }else{
            throw new UserNotFoundException("Can not update laptop list. It doesn't exist");
        }
    }

    public void update(String model, Integer amount) throws UserNotFoundException {
        LaptopEntity laptop1 = laptopRepo.findByModel(model);
        if(laptop1!=null){
            laptop1.setAmount(amount);
            laptopRepo.save(laptop1);
        }else{
            throw new UserNotFoundException("Can not update laptop list. It doesn't exist");
        }
    }

    public void delete(Long id) throws UserNotFoundException {
        if(laptopRepo.findById(id).get()!=null) {
            LaptopEntity laptop = laptopRepo.findById(id).get();
            laptop.setStatus(LaptopEnum.deleted);
        }else throw new UserNotFoundException("Can not update laptop list. It doesn't exist");
    }

    public void delete(String model) throws UserNotFoundException {
        if(laptopRepo.findByModel(model)!=null) {
            LaptopEntity laptop = laptopRepo.findByModel(model);
            laptop.setStatus(LaptopEnum.deleted);
            laptopRepo.save(laptop);
        }else throw new UserNotFoundException("Can not update laptop list. It doesn't exist");
    }

    public Page<LaptopEntity> filter(LaptopPage page, LaptopSearchCriteria laptopSearchCriteria){
        return laptopCriteriaRepo.findAllWithFilters(page,laptopSearchCriteria);
    }

}
