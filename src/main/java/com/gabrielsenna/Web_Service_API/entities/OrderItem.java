package com.gabrielsenna.Web_Service_API.entities;

import com.gabrielsenna.Web_Service_API.entities.pk.OrderItemPK;

import java.io.Serializable;
import java.util.Objects;

public class OrderItem implements Serializable {

    private OrderItemPK id;


    private Integer quantity;
    private Double price;

    public OrderItem(){}

    public OrderItem(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItem orderItem)) return false;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
