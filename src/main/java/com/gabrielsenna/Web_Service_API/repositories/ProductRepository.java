package com.gabrielsenna.Web_Service_API.repositories;

import com.gabrielsenna.Web_Service_API.entities.Category;
import com.gabrielsenna.Web_Service_API.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
