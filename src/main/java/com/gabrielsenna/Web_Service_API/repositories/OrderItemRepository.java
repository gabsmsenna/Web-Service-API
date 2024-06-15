package com.gabrielsenna.Web_Service_API.repositories;

import com.gabrielsenna.Web_Service_API.entities.OrderItem;
import com.gabrielsenna.Web_Service_API.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
