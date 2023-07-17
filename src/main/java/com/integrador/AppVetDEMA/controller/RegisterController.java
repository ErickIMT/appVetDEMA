package com.integrador.AppVetDEMA.controller;

import com.integrador.AppVetDEMA.config.database.entities.Owner;
import com.integrador.AppVetDEMA.config.database.entities.Pet;
import com.integrador.AppVetDEMA.config.database.jpa.OwnerRepository;
import com.integrador.AppVetDEMA.config.database.jpa.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/register")
public class RegisterController {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private OwnerRepository ownerRepository;


    /*Mascotas*/

    @GetMapping("/pet")
    public List<Pet> getAllPets() {

        return petRepository.findAll();
    }

    @GetMapping("/pet/{id}")
    public Pet getPetById(@RequestParam("id") Long id) {
        return petRepository.getById(id);
    }

    @PostMapping("/pet")
    public void savePet(@RequestBody Pet pet) {

        petRepository.save(pet);
    }


    /*Dueño*/
    @GetMapping("/owner")
    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    @GetMapping("/owner/{id}")
    public Owner getOwnerById(@RequestParam("id") Long id) {
        return ownerRepository.getById(id);
    }


    @PostMapping("/owner")
    public void saveOwner(@RequestBody Owner owner) {
        ownerRepository.save(owner);
    }


}
