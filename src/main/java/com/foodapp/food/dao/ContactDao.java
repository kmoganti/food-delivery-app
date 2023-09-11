package com.foodapp.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodapp.food.model.Contact;

public interface ContactDao extends JpaRepository<Contact,Integer> {
}
