package model;

import static model.constants.Colour.RED_APPLE;
import static model.constants.Discount.RED_APPLE_DISCOUNT;

public class Apple extends Food {
    private final String colour;

    public Apple(int amount, double price, String colour) {
        super.amount = amount;
        super.price = price;
        super.isVegetarian = true;
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(RED_APPLE)) {
            return RED_APPLE_DISCOUNT;
        }
        return 0;
    }
}
