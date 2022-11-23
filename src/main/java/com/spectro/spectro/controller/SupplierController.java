package com.spectro.spectro.controller;
import com.spectro.spectro.entity.SupplierEntity;
import com.spectro.spectro.exception.UserAlreadyExistException;
import com.spectro.spectro.exception.UserNotFoundException;
import com.spectro.spectro.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;
    @CrossOrigin
    @PostMapping
    public ResponseEntity reg(@RequestBody SupplierEntity supplier){
        try {
            supplierService.registerSup(supplier);
            return ResponseEntity.ok("Сохранил");
        }catch (UserAlreadyExistException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
    @CrossOrigin
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody SupplierEntity supplier){
        try {
            return ResponseEntity.ok(supplierService.login(supplier));
        }catch (UserAlreadyExistException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошв");
        }
    }
    @CrossOrigin
    @GetMapping
    public ResponseEntity getOneClient(@RequestParam Long id){
        try{
            return ResponseEntity.ok(supplierService.getOne(id));
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }catch (UserNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @CrossOrigin
    @PatchMapping("{id}")
    public ResponseEntity updates(@PathVariable("id") Long id, @RequestBody SupplierEntity user){
        try {
            supplierService.update(user, id);
            return ResponseEntity.ok("Изменил");
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла оышв");
        } catch (UserNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    @CrossOrigin
    @DeleteMapping("{id}")
    public ResponseEntity deleteClient(@PathVariable Long id){
        try{
            return ResponseEntity.ok(supplierService.delete(id));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
