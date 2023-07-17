package com.integrador.AppVetDEMA.service;

import com.integrador.AppVetDEMA.config.database.entities.*;
import com.integrador.AppVetDEMA.config.database.entities.types.UserType;
import com.integrador.AppVetDEMA.config.database.jpa.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private ProductRepository productRepository;

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

    public List<Appointment> getAllAppointment() {
        return appointmentRepository.findAll();
    }

    public void createAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }

    public List<Pet> getAllPets(){
        return petRepository.findAll();
    }

    public void createPet(Pet pet) {
        petRepository.save(pet);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void createProduct(Product product) {
        productRepository.save(product);
    }

    public void createSales() {

    }

}
