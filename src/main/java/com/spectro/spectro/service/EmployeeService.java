package com.spectro.spectro.service;

import com.spectro.spectro.entity.EmployeeEntity;
import com.spectro.spectro.exception.UserAlreadyExistException;
import com.spectro.spectro.exception.UserNotFoundException;
import com.spectro.spectro.model.Employee;
import com.spectro.spectro.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    public EmployeeEntity registerEmployee(EmployeeEntity employee) throws UserAlreadyExistException {
        if(employeeRepo.findByName(employee.getName()) != null){
            throw new UserAlreadyExistException("Такой поставщик уже зарегестрирован");
        }
        else if(employeeRepo.findByEmail(employee.getEmail())!=null){
            throw new UserAlreadyExistException("Такой email уже занят");
        }
        else if(employeeRepo.findByNumberphone(employee.getNumberphone())!=null){
            throw new UserAlreadyExistException("Такой номер уже занят");
        }
        return employeeRepo.save(employee);
    }

    public Employee getOne(Long id) throws UserNotFoundException {
        EmployeeEntity employee = employeeRepo.findById(id).get();
        if(employee == null){
            throw new UserNotFoundException("Пользователь не найден");
        }
        return Employee.toModel(employee);
    }

    public Employee login(EmployeeEntity employee) throws UserAlreadyExistException {
        EmployeeEntity repairm =  employeeRepo.findByEmail(employee.getEmail());
        EmployeeEntity repairp = employeeRepo.findByPassword(employee.getPassword());
        if(repairm.equals(repairp)){
            return Employee.toModel(repairm);
        }
        return Employee.toError("error");
//        RepairmanEntity repid = repairmanRepo.findById(repairm.getId()).get();
    }

    public EmployeeEntity update(EmployeeEntity user, Long id) throws UserNotFoundException {
        EmployeeEntity employee = employeeRepo.findById(id).get();
        if(employee == null){
            throw new UserNotFoundException("Пользователь не найден");
        }
        employee.setName(user.getName());
        employee.setNumberphone(user.getNumberphone());
        employee.setPassword(user.getPassword());
        return employeeRepo.save(employee);
    }
    public Long delete(Long id){
        employeeRepo.deleteById(id);
        return id;
    }
}
