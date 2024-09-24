package org.designpatterns.structural.decorator_7.example1_coffee_shop.coffee_ingredients_decorators_impl;

import org.designpatterns.structural.decorator_7.example1_coffee_shop.CoffeeIngredients;
import org.designpatterns.structural.decorator_7.example1_coffee_shop.CoffeeIngredientsDecorator;
import org.designpatterns.structural.decorator_7.example1_coffee_shop.coffee_ingredients_impl.Coffee;

public class CoffeeDecorator extends CoffeeIngredientsDecorator {

    public CoffeeDecorator(CoffeeIngredients c) {
        super(c, new Coffee());
    }

}
