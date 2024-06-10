package com.gabrielsenna.Web_Service_API.repositories;

import com.gabrielsenna.Web_Service_API.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
