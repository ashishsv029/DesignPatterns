package org.designpatterns.structural.decorator_7.example1_coffee_shop;

import org.designpatterns.structural.decorator_7.example1_coffee_shop.coffee_ingredients_impl.Sugar;

public abstract class CoffeeIngredientsDecorator implements CoffeeIngredients {
    public CoffeeIngredients innerCoffeeIngredient;
    public CoffeeIngredients wrappedCoffeeIngredient; // should be injected ideally
    public CoffeeIngredientsDecorator(CoffeeIngredients innerIngredient, CoffeeIngredients wrappedIngredient) {
        this.innerCoffeeIngredient = innerIngredient;
        this.wrappedCoffeeIngredient = wrappedIngredient;
    }

    @Override
    public String getDescription() {
        return wrappedCoffeeIngredient.getDescription() + ", " + (this.innerCoffeeIngredient != null ? this.innerCoffeeIngredient.getDescription() : "");
    }

    @Override
    public double getCost() {
        return wrappedCoffeeIngredient.getCost() + (this.innerCoffeeIngredient != null ? this.innerCoffeeIngredient.getCost() : 0);
    }

}
