package Toppings;

import Pizza.BasePizza;

public class ExtraCheese extends TopingsDecorator{
    BasePizza pizza;

    public ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return pizza.cost()+20;
    }
}
