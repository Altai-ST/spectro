package com.spectro.spectro.service;

import com.spectro.spectro.entity.PhoneEntity;
import com.spectro.spectro.entity.UserEntity;
import com.spectro.spectro.exception.UserAlreadyExistException;
import com.spectro.spectro.exception.UserNotFoundException;
import com.spectro.spectro.model.User;
import com.spectro.spectro.repository.PhoneRepo;
import com.spectro.spectro.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private PhoneRepo phoneRepo;

    public UserEntity register(UserEntity user) throws UserAlreadyExistException {
        if(userRepo.findByUsername(user.getUsername()) != null){
            throw new UserAlreadyExistException("Такой пользователь уже есть");
        }
        else if(userRepo.findByEmail(user.getEmail())!=null){
            throw new UserAlreadyExistException("Такой email уже занят");
        }
        else if(userRepo.findByNumberphone(user.getNumberphone())!=null){
            throw new UserAlreadyExistException("Такой номер уже занят");
        }
        return userRepo.save(user);
    }

    public UserEntity update(UserEntity user, Long id) throws UserNotFoundException {
        UserEntity users = userRepo.findById(id).get();
        if(users == null){
            throw new UserNotFoundException("Пользователь не найден");
        }
        users.setUsername(user.getUsername());
        users.setNumberphone(user.getNumberphone());
        users.setPassword(user.getPassword());
        return userRepo.save(users);
    }
    public UserEntity login(UserEntity user) throws UserAlreadyExistException {
        if(userRepo.findByEmail(user.getEmail())!=null){
            throw new UserAlreadyExistException("Введите пароль");

        }
        else if(userRepo.findByPassword(user.getPassword())!=null){
            throw new UserAlreadyExistException("");
        }
        return userRepo.save(user);
    }

    public User getOne(Long id) throws UserNotFoundException{
        UserEntity user = userRepo.findById(id).get();
        if(user == null){
            throw new UserNotFoundException("Пользователь не найден");
        }
        return User.toModel(user);
    }

    public Long delete(Long id){
        userRepo.deleteById(id);
        return id;
    }
}
