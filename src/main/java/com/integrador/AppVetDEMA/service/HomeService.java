package com.integrador.AppVetDEMA.service;

import com.integrador.AppVetDEMA.config.database.entities.User;
import com.integrador.AppVetDEMA.config.database.entities.types.UserType;
import com.integrador.AppVetDEMA.config.database.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    @Autowired
    private UserRepository userRepository;

    public UserType login(User user) {
        User u = userRepository.findByUsername(user.getUsername());
        if(u != null) {
            if (user.getPassword().equals(u.getPassword())) {
                return u.getUserType();
            } else {
                return null;
            }
        } else {
            return null;
        }

    }

}
