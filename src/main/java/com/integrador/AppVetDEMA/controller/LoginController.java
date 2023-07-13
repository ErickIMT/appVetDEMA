package com.integrador.AppVetDEMA.controller;

import com.integrador.AppVetDEMA.config.database.entities.Product;
import com.integrador.AppVetDEMA.config.database.entities.Sales;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

    public String list(Model model) {
        model.addAttribute("productList", buildProductList());
        return "productList";
    }

    private List<Product> buildProductList() {
        List<Product> productos = new ArrayList<>();

        productos.add(new Product("algo",255,20, new ArrayList<Sales>()));
        productos.add(new Product("some",255,20, new ArrayList<Sales>()));
        productos.add(new Product("test",255,20, new ArrayList<Sales>()));

        return productos;
    }
}
