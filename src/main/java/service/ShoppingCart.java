package service;

import model.Food;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalAmountWithoutDiscount() {
        double totalAmount = 0;
        for (Food food : foods) {
            if (food.getDiscount() == 0) {
                totalAmount += food.getAmount() * food.getPrice();
            }
        }
        return totalAmount;
    }

    public double getTotalAmountWithDiscount() {
        double totalAmount = 0;
        for (Food food : foods) {
            if (food.getDiscount() != 0) {
                totalAmount += food.getAmount() * food.getPrice() * (1 - (food.getDiscount() / 100));
            }
        }
        return totalAmount;
    }

    public double getTotalAmountVegetreianWithoutDiscount() {
        double totalAmount = 0;
        for (Food food : foods) {
            if (food.getDiscount() == 0 && food.getIsVegetarian()) {
                totalAmount += food.getAmount() * food.getPrice();
            }
        }
        return totalAmount;
    }

}
