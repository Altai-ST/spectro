package com.spectro.spectro.model;

import com.spectro.spectro.entity.DetailorderedEntity;

public class Detailordered {
    private Long id;
    private String detail;
    private String amount;
    private Boolean status;
    private String data;

    public static Detailordered toModel(DetailorderedEntity entity){
        Detailordered model = new Detailordered();
        model.setId(entity.getId());
        model.setDetail(entity.getDetail());
        model.setAmount(entity.getAmount());
        model.setStatus(entity.getStatus());
        return model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
