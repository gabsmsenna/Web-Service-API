package com.gabrielsenna.Web_Service_API.services;

import com.gabrielsenna.Web_Service_API.entities.Product;
import com.gabrielsenna.Web_Service_API.entities.User;
import com.gabrielsenna.Web_Service_API.repositories.ProductRepository;
import com.gabrielsenna.Web_Service_API.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
