package com.foodapp.food.controller;

import com.foodapp.food.dao.FoodDaoImpl;
import com.foodapp.food.model.Food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin
public class FoodController {

    @Autowired
    FoodDaoImpl foodDao;

    @RequestMapping(value = "/menu")
    public List<Food> getMenu(Model model) {
        List<Food> foodItems ;
        foodItems = foodDao.getFoodList();
        return foodItems;
    }


}
