package com.integrador.AppVetDEMA.service;

import com.integrador.AppVetDEMA.config.database.entities.Employee;
import com.integrador.AppVetDEMA.config.database.entities.User;
import com.integrador.AppVetDEMA.config.database.entities.types.UserType;
import com.integrador.AppVetDEMA.config.database.jpa.EmployeeRepository;
import com.integrador.AppVetDEMA.config.database.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public UserType login(User user) {
        User u = userRepository.findByUsername(user.getUsername());
        if (u != null) {
            if (user.getPassword().equals(u.getPassword())) {
                return u.getUserType();
            } else {
                return null;
            }
        } else {
            return null;
        }

    }

    public List<User> getAllUSers() {
        return userRepository.findAll();
    }

    public void createUser(User user) {
        User userAux = new User();
        userAux.setUsername(user.getUsername());
        userAux.setPassword(user.getPassword());
        userAux.setUserType(user.getUserType());
        userRepository.save(user);

        Employee employee = user.getEmployee();
        employee.setUser(userRepository.findByUsername(user.getUsername()));

        employeeRepository.save(employee);

    }

}
