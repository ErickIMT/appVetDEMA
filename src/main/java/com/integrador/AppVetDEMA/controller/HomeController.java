package com.integrador.AppVetDEMA.controller;

import com.integrador.AppVetDEMA.config.database.entities.User;
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
}
