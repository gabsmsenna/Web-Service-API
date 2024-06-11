package com.gabrielsenna.Web_Service_API.services;

import com.gabrielsenna.Web_Service_API.entities.Category;
import com.gabrielsenna.Web_Service_API.entities.User;
import com.gabrielsenna.Web_Service_API.repositories.CategoryRepository;
import com.gabrielsenna.Web_Service_API.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
