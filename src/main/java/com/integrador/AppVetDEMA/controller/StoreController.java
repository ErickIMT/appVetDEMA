package com.integrador.AppVetDEMA.controller;

import com.integrador.AppVetDEMA.config.database.entities.Product;
import com.integrador.AppVetDEMA.config.database.entities.SalesDocument;
import com.integrador.AppVetDEMA.config.database.jpa.ProductRepository;
import com.integrador.AppVetDEMA.config.database.jpa.SalesDocumentRepository;
import com.integrador.AppVetDEMA.config.database.jpa.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/store")
public class StoreController {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private SalesRepository salesRepository;
    @Autowired
    private SalesDocumentRepository salesDocumentRepository;

    /*Productos*/
    @GetMapping("/product")
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@RequestParam("id") Long id) {
        return productRepository.getById(id);
    }

    @PostMapping("/product")
    public void saveProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

    /*Ventas*/
    @GetMapping("/sale")
    public List<SalesDocument> getAllSalesDocument() {
        return salesDocumentRepository.findAll();
    }

    @GetMapping("/sale/{id}")
    public SalesDocument getSaleDocumentById(@RequestParam("id") Long id) {
        return salesDocumentRepository.getById(id);
    }

    @PostMapping("/sale")
    public void saveSalesDocument(@RequestBody SalesDocument salesDocument) {
        salesDocumentRepository.save(salesDocument);
    }




}
