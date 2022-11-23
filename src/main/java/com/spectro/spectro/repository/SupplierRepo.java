package com.spectro.spectro.repository;

import com.spectro.spectro.entity.SupplierEntity;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepo extends CrudRepository<SupplierEntity, Long> {
    SupplierEntity findByUsername(String username);
    SupplierEntity findByEmail(String email);
    SupplierEntity findByNumberphone(String number);
    SupplierEntity findByPassword(String password);
}
