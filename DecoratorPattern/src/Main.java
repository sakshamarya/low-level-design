import Pizza.BasePizza;
import Pizza.Marghareitta;
import Toppings.ExtraCheese;
import Toppings.Mushrooms;

public class Main {
    public static void main(String[] args) {
        // pizza ordered, marghareitta
        BasePizza pizza = new Marghareitta();

        System.out.println(pizza.cost());

        // topping 1 - extra cheese
        pizza = new ExtraCheese(pizza);

        System.out.println(pizza.cost());

        // topping 2 - mushrooms
        pizza = new Mushrooms(pizza);

        System.out.println(pizza.cost());
    }
}