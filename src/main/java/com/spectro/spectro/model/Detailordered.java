package com.spectro.spectro.model;

import com.spectro.spectro.entity.DetailorderedEntity;
import lombok.Getter;
import lombok.Setter;

public class Detailordered {
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String detail;
    @Getter
    @Setter
    private String amount;
    @Getter
    @Setter
    private Boolean status;
    @Getter
    @Setter
    private String description;

    public static Detailordered toModel(DetailorderedEntity entity){
        Detailordered model = new Detailordered();
        model.setId(entity.getId());
        model.setDetail(entity.getDetail());
        model.setAmount(entity.getAmount());
        model.setStatus(entity.getStatus());
        return model;
    }
}
