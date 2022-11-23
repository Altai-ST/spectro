package com.spectro.spectro.controller;
import com.spectro.spectro.entity.DetailorderedEntity;
import com.spectro.spectro.exception.UserNotFoundException;
import com.spectro.spectro.service.DetailorderedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("detailordered")
public class DetailorderedController {
    @Autowired
    private DetailorderedService detailorderedService;

    @PostMapping
    public ResponseEntity reg(@RequestBody DetailorderedEntity detailordered){
        try {
            detailorderedService.register(detailordered);
            return ResponseEntity.ok("Сохранил");
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошв");
        }
    }

    @GetMapping
    public ResponseEntity getOneClient(@RequestParam Long id){
        try{
            return ResponseEntity.ok(detailorderedService.getOne(id));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }catch (UserNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @DeleteMapping("{id}")
    public ResponseEntity deleteClient(@PathVariable Long id){
        try{
            return ResponseEntity.ok(detailorderedService.delete(id));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
