package com.spectro.spectro.model;

import com.spectro.spectro.entity.SupplierEntity;

public class Supplier {
    private Long id;
    private String username;
    private String email;
    private String numberphone;
    private String password;
    private String company;
    private String role;

    public static Supplier toError(String er){
        Supplier error = new Supplier();
        error.setEmail(er);
        return error;
    }

    public static Supplier toModel(SupplierEntity entity){
        Supplier model = new Supplier();
        model.setId(entity.getId());
        model.setUsername(entity.getUsername());
        model.setEmail(entity.getEmail());
        model.setNumberphone(entity.getNumberphone());
        model.setPassword(entity.getPassword());
        model.setCompany(entity.getCompany());
        model.setRole(entity.getRole());
        return model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(String numberphone) {
        this.numberphone = numberphone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
