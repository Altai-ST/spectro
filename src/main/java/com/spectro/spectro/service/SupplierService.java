package com.spectro.spectro.service;

import com.spectro.spectro.entity.SupplierEntity;
import com.spectro.spectro.exception.UserAlreadyExistException;
import com.spectro.spectro.exception.UserNotFoundException;
import com.spectro.spectro.model.Supplier;
import com.spectro.spectro.repository.SupplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepo supplierRepo;
    public SupplierEntity registerSup(SupplierEntity supplier) throws UserAlreadyExistException {
        if(supplierRepo.findByUsername(supplier.getUsername()) != null){
            throw new UserAlreadyExistException("Такой поставщик уже зарегестрирован");
        }
        else if(supplierRepo.findByEmail(supplier.getEmail())!=null){
            throw new UserAlreadyExistException("Такой email уже занят");
        }
        else if(supplierRepo.findByNumberphone(supplier.getNumberphone())!=null){
            throw new UserAlreadyExistException("Такой номер уже занят");
        }
        return supplierRepo.save(supplier);
    }

    public Supplier getOne(Long id) throws UserNotFoundException {
        SupplierEntity supplier = supplierRepo.findById(id).get();
        if(supplier == null){
            throw new UserNotFoundException("Пользователь не найден");
        }
        return Supplier.toModel(supplier);
    }

    public Supplier login(SupplierEntity suplier) throws UserAlreadyExistException {
        SupplierEntity repairm =  supplierRepo.findByEmail(suplier.getEmail());
        SupplierEntity repairp = supplierRepo.findByPassword(suplier.getPassword());
        if(repairm.equals(repairp)){
            return Supplier.toModel(repairm);
        }
        return Supplier.toError("error");
//        RepairmanEntity repid = repairmanRepo.findById(repairm.getId()).get();
    }

    public SupplierEntity update(SupplierEntity user, Long id) throws UserNotFoundException {
        SupplierEntity supplier = supplierRepo.findById(id).get();
        if(supplier == null){
            throw new UserNotFoundException("Пользователь не найден");
        }
        supplier.setUsername(user.getUsername());
        supplier.setNumberphone(user.getNumberphone());
        supplier.setPassword(user.getPassword());
        return supplierRepo.save(supplier);
    }
    public Long delete(Long id){
        supplierRepo.deleteById(id);
        return id;
    }
}
