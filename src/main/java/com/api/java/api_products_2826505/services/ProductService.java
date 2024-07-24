package com.api.java.api_products_2826505.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.java.api_products_2826505.repositories.ProductRepository;
import com.api.java.api_products_2826505.entities.Product;

@Service

public class ProductService {
    @Autowired
    private ProductRepository repository ;

    //Metodos
    //Read
    List<Product> findAll (){
        return (java.util.List<Product>) repository.findAll();
    }

    }
        
    


