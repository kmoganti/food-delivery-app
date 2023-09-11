package com.foodapp.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodapp.food.model.Cart;

public interface CartDao extends JpaRepository<Cart,Integer> {
}
