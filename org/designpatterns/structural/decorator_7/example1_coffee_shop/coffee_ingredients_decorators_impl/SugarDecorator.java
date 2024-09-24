package org.designpatterns.structural.decorator_7.example1_coffee_shop.coffee_ingredients_decorators_impl;

import org.designpatterns.structural.decorator_7.example1_coffee_shop.CoffeeIngredients;
import org.designpatterns.structural.decorator_7.example1_coffee_shop.CoffeeIngredientsDecorator;
import org.designpatterns.structural.decorator_7.example1_coffee_shop.coffee_ingredients_impl.Coffee;
import org.designpatterns.structural.decorator_7.example1_coffee_shop.coffee_ingredients_impl.Cream;
import org.designpatterns.structural.decorator_7.example1_coffee_shop.coffee_ingredients_impl.Sugar;

public class SugarDecorator extends CoffeeIngredientsDecorator {
    public SugarDecorator(CoffeeIngredients c) {
        super(c, new Sugar());
    }
}
