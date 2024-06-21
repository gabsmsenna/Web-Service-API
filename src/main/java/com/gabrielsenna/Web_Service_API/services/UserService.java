package com.gabrielsenna.Web_Service_API.services;

import com.gabrielsenna.Web_Service_API.entities.User;
import com.gabrielsenna.Web_Service_API.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public User insert(User userObj) {
        return repository.save(userObj);
    }
}
