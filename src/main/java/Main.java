import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.*;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApples = new Apple(10, 50, RED_APPLE);
        Food greenApples = new Apple(8, 60, GREEN_APPLE);

        Food[] products = {meat, redApples, greenApples};

        ShoppingCart shoppingCart = new ShoppingCart(products);

        System.out.println(shoppingCart.getTotalAmountWithoutDiscount());
        System.out.println(shoppingCart.getTotalAmountWithDiscount());
        System.out.println(shoppingCart.getTotalAmountVegetreianWithoutDiscount());
    }
}
