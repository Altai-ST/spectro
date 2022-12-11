package com.spectro.spectro.controller;
import com.spectro.spectro.entity.PhoneEntity;
import com.spectro.spectro.exception.UserAlreadyExistException;
import com.spectro.spectro.exception.UserNotFoundException;
import com.spectro.spectro.repository.PhoneRepo;
import com.spectro.spectro.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/phone")
public class PhoneController {
    @Autowired
    private PhoneService phoneService;
    private PhoneRepo phoneRepo;
    @CrossOrigin
    @PostMapping
    public ResponseEntity reg(@RequestBody PhoneEntity phone){
        try {
            phoneService.register(phone);
            return ResponseEntity.ok("Сохранил");
        }catch (UserAlreadyExistException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка3");
        }
    }
    @CrossOrigin
    @GetMapping
    public ResponseEntity getOnePhone(@RequestParam Long id){
        try{
            return ResponseEntity.ok(phoneService.getOne(id));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка 2");
        }catch (UserNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @CrossOrigin
    @PatchMapping("{id}")
    public ResponseEntity updates(@PathVariable("id") Long id, @RequestBody PhoneEntity phone){
        try {
            phoneService.update(phone, id);
            return ResponseEntity.ok("Изменил");
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла оышв");
        } catch (UserNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @CrossOrigin
    @DeleteMapping("{id}")
    public ResponseEntity deletePhone(@PathVariable Long id){
        try{
            return ResponseEntity.ok(phoneService.delete(id));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка 4");
        }
    }
}