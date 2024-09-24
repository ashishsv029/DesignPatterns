package org.designpatterns.structural.decorator_7.example1_coffee_shop.coffee_ingredients_decorators_impl;

import org.designpatterns.structural.decorator_7.example1_coffee_shop.CoffeeIngredients;
import org.designpatterns.structural.decorator_7.example1_coffee_shop.CoffeeIngredientsDecorator;
import org.designpatterns.structural.decorator_7.example1_coffee_shop.coffee_ingredients_impl.Coffee;
import org.designpatterns.structural.decorator_7.example1_coffee_shop.coffee_ingredients_impl.Cream;
import org.designpatterns.structural.decorator_7.example1_coffee_shop.coffee_ingredients_impl.Milk;

public class MilkDecorator extends CoffeeIngredientsDecorator {
    public MilkDecorator(CoffeeIngredients c) {
        super(c, new Milk());
    }
}
