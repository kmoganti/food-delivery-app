package com.foodapp.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodapp.food.model.Food;


public interface FoodDao extends JpaRepository<Food,String> {

}
