package com.foodapp.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodapp.food.model.User;

public interface UserDao extends JpaRepository<User,String> {
}
