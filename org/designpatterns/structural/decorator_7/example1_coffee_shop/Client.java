package org.designpatterns.structural.decorator_7.example1_coffee_shop;

import org.designpatterns.structural.decorator_7.example1_coffee_shop.coffee_ingredients_decorators_impl.MilkDecorator;
import org.designpatterns.structural.decorator_7.example1_coffee_shop.coffee_ingredients_decorators_impl.SugarDecorator;
import org.designpatterns.structural.decorator_7.example1_coffee_shop.coffee_ingredients_impl.Coffee;

public class Client {
    public static void main(String[] args) {
        CoffeeIngredients myCoffee = new Coffee();
        System.out.println("Simple Coffee = " + myCoffee.getDescription() + " - " + myCoffee.getCost());
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println("Milk Coffee = " + myCoffee.getDescription() + " - " + myCoffee.getCost());
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println("Milk Coffee with added sugar = " + myCoffee.getDescription() + " - " + myCoffee.getCost());


    }
}
