package com.integrador.AppVetDEMA.controller;

import com.integrador.AppVetDEMA.config.database.entities.*;
import com.integrador.AppVetDEMA.config.database.entities.types.UserType;
import com.integrador.AppVetDEMA.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping({"/", "/login"})
    public ModelAndView index() {
        return new ModelAndView("index", "user", new User());
    }

    @PostMapping("/login")
    public String login(@Validated @ModelAttribute("user") User user, BindingResult result, ModelMap model) {

        UserType userType = homeService.login(user);

        if(userType == null) {
            model.addAttribute("message", "Usuario o Password Erroneo");
            return "index";
        }

        switch (userType) {
            case ADMINISTRADOR:
                return "home-administrador";
            case USUARIO:
                return "home-usuario";
            case VETERINARIO:
                return "home-veterinario";
            default:
                model.addAttribute("message", "Usuario o Password Erroneo");
                return "index";

        }

    }

    @GetMapping("/users")
    public String usersList(Model model) {
        model.addAttribute("usersList", homeService.getAllUSers());

        return "users";

    }

    @GetMapping("/users/form")
    public ModelAndView userForm() {
        return new ModelAndView("user-form", "user", new User());
    }

    @PostMapping("/users/create")
    public String createUser(@Validated @ModelAttribute("user") User user, BindingResult result, ModelMap model) {
        homeService.createUser(user);

        return "redirect:/users";

    }

    @GetMapping("/citas")
    public String citasList(Model model) {
        model.addAttribute("citasList", homeService.getAllAppointment());

        return "citas";

    }

    @PostMapping("/citas/create")
    public String createAppointment(@Validated @ModelAttribute("appointment") Appointment appointment, BindingResult result, ModelMap model) {
        homeService.createAppointment(appointment);

        System.out.println(appointment.getDate());

        return "redirect:/citas";

    }

    @GetMapping("/citas/form")
    public String citasForm(Model model) {
        model.addAttribute("vetList", homeService.getallVet());
        model.addAttribute("petList", homeService.getAllPets());
        model.addAttribute("appointment", new Appointment());

        return "cita-form";
    }

    @GetMapping("/mascotas")
    public String petsList(Model model) {
        model.addAttribute("petsList", homeService.getAllPets());

        return "mascotas";

    }

    @PostMapping("/mascotas/create")
    public String createPet(@Validated @ModelAttribute("pet") Pet pet, BindingResult result, ModelMap model) {
        Long id = homeService.createPet(pet);

        return "redirect:/owner/form/"+id;

    }

    @GetMapping("/mascotas/form")
    public String mascotasForm(Model model) {
        model.addAttribute("pet", new Pet());

        return "mascotas-form";
    }

    @GetMapping("/owner/form/{id}")
    public String ownerForm(@PathVariable Long id, Model model) {
        model.addAttribute("owner", new Owner());
        model.addAttribute("petId",id);

        return "owner-form";
    }

    @PostMapping("/owner/create/{id}")
    public String createOwner(@PathVariable Long id,@Validated @ModelAttribute("owner") Owner owner, BindingResult result, ModelMap model) {

        homeService.createOwner(owner,id);

        return "redirect:/mascotas";

    }

    @GetMapping("/inventario")
    public String productsList(Model model) {
        model.addAttribute("productsLists", homeService.getAllProducts());

        return "inventario";

    }

    @GetMapping("/inventario/form")
    public String inventarioForm(Model model) {
        model.addAttribute("product", new Product());

        return "inventario-form";
    }

    @PostMapping("/inventario/create")
    public String createProduct(@Validated @ModelAttribute("product") Product product, BindingResult result, ModelMap model) {
        homeService.createProduct(product);

        return "redirect:/inventario";

    }

    @PostMapping("/tienda/create")
    public String createSale(@Validated @ModelAttribute("salesDocument") SalesDocument salesDocument, BindingResult result, ModelMap model) {
        return null;
    }

    @GetMapping({"/tienda-form"})
    public String tienda(Model model) {
        model.addAttribute("salesDocument", new SalesDocument());
        model.addAttribute("productList", homeService.getAllProducts());

        return "tienda-form";
    }
}
