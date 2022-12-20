package com.spectro.spectro.repository;

import com.spectro.spectro.entity.LaptopEntity;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepo extends JpaRepository<LaptopEntity, Long>, JpaSpecificationExecutor<LaptopEntity> {

    LaptopEntity findById(ID id);

    LaptopEntity findByModel(String model);

    LaptopEntity findByManufacturer(String manufature);

    LaptopEntity findByCamera(String camera);

    LaptopEntity findByOS(String os);

    LaptopEntity findByHousingMaterial(String housingMaterial);

    LaptopEntity findByProcessorType(String processorType);

    LaptopEntity findByRAM(String RAM);

    LaptopEntity findByMemory(String memory);

    LaptopEntity findByScreenSize(String screenSize);

    LaptopEntity findByScreenResolution(String screenResolution);

    LaptopEntity findByHeadphoneJack(String headphone_jack);

    LaptopEntity findByVideoCard(String video_card);

    List<LaptopEntity> findAllByModel(String model);

    List<LaptopEntity> findAllByManufacturer(String manufature);

    List<LaptopEntity> findAllByCamera(String camera);

    List<LaptopEntity> findAllByOS(String os);

    List<LaptopEntity> findAllByHousingMaterial(String housingMaterial);

    List<LaptopEntity> findAllByProcessorType(String processorType);

    List<LaptopEntity> findAllByRAM(String RAM);

    List<LaptopEntity> findAllByMemory(String memory);

    List<LaptopEntity> findAllByScreenSize(String screenSize);

    List<LaptopEntity> findAllByScreenResolution(String screenResolution);

    List<LaptopEntity> findAllByHeadphoneJack(String headphone_jack);

    List<LaptopEntity> findAllByVideoCard(String video_card);
}
