package com.spectro.spectro.service;

import com.spectro.spectro.entity.DetailorderedEntity;
import com.spectro.spectro.exception.UserNotFoundException;
import com.spectro.spectro.model.Detailordered;
import com.spectro.spectro.repository.DetailorderedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailorderedService {
    @Autowired
    private DetailorderedRepo detailorderedRepo;
    public DetailorderedEntity register(DetailorderedEntity detailordered) {
        if(detailorderedRepo.findByDetail(detailordered.getDetail()) != null){
            return detailorderedRepo.findByAmount(detailordered.getAmount());
        }
        return detailorderedRepo.save(detailordered);
    }

    public Detailordered getOne(Long id) throws UserNotFoundException {
        DetailorderedEntity detailordered = detailorderedRepo.findById(id).get();
        if(detailordered == null){
            throw new UserNotFoundException("Товар не найден");
        }
        return Detailordered.toModel(detailordered);
    }

    public Long delete(Long id){
        detailorderedRepo.deleteById(id);
        return id;
    }
}
