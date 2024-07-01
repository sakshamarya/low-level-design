package Toppings;

import Pizza.BasePizza;

public class Mushrooms extends TopingsDecorator{
    BasePizza pizza;
    public Mushrooms(BasePizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return pizza.cost()+10;
    }
}
