package org.designpatterns.structural.decorator_7.example1_coffee_shop.coffee_ingredients_impl;

import org.designpatterns.structural.decorator_7.example1_coffee_shop.CoffeeIngredients;

public class Cream implements CoffeeIngredients {
    @Override
    public String getDescription() {
        return "cream";
    }

    @Override
    public double getCost() {
        return 12;
    }
}
