package com.spectro.spectro.controller;

import com.spectro.spectro.entity.LaptopEntity;
import com.spectro.spectro.enums.LaptopEnum;
import com.spectro.spectro.exception.UserNotFoundException;
import com.spectro.spectro.repository.LaptopRepo;
import com.spectro.spectro.service.LaptopService;
import com.spectro.spectro.model.LaptopPage;
import com.spectro.spectro.model.LaptopSearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/laptop")
public class LaptopController {
    @Autowired
    private LaptopService laptopService;

    @GetMapping(value = "/")
    public String mainPage() {
        return "laptopMainPage";
    }

    @GetMapping
    public String laptopMainPage(){
        return "laptopMainPage";
    }

    @GetMapping(value = "newlaptop")
    public String newLaptop(){
        return "newLaptop";
    }

    @PostMapping(value = "/saveNewLaptop")
    public ResponseEntity saveNewLaptop(@RequestBody LaptopEntity laptop){
        try {
            laptop.setStatus(LaptopEnum.available);
            laptopService.save(laptop);
            return ResponseEntity.ok("Сохранил");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Ошибка сохранения нового ноутбука");
        }
    }

    @PatchMapping(value = "/updateLaptop")
    public String updateLaptop(@RequestParam("model") String model, @RequestParam("amount") Integer amount) throws Exception {
        try {
            laptopService.update(model, amount);
            return "succsess";
        } catch (UserNotFoundException e) {
            throw new RuntimeException(e);
        }catch (Exception e){
            throw new Exception(e);
        }
    }

    @DeleteMapping(value = "/deleteLaptop")
    public String deleteLaptop(@RequestParam("model") String model){
        try {
            laptopService.delete(model);
            return "Success";
        } catch (UserNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping(value = "/filter")
    public ResponseEntity<Page<LaptopEntity>> getLaptops(LaptopPage laptopPage, LaptopSearchCriteria laptopSearchCriteria){
        return new ResponseEntity<>(laptopService.filter(laptopPage,laptopSearchCriteria), HttpStatus.OK);
    }

    @GetMapping(value = "/searchModel")
    public ResponseEntity<LaptopEntity> getOneLaptop(String model){
        return new ResponseEntity<>(laptopService.findByModel(model), HttpStatus.OK);
    }
}
