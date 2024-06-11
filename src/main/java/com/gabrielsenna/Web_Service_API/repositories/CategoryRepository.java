package com.gabrielsenna.Web_Service_API.repositories;

import com.gabrielsenna.Web_Service_API.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
