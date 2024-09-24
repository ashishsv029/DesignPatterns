package org.designpatterns.structural.decorator_7.example1_coffee_shop.coffee_ingredients_impl;

import org.designpatterns.structural.decorator_7.example1_coffee_shop.CoffeeIngredients;

public class Sugar implements CoffeeIngredients {
    @Override
    public String getDescription() {
        return "sugar";
    }

    @Override
    public double getCost() {
        return 5;
    }
}
