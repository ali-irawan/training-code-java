package com.example;

public class DiscountCalculator {

    /**
     * Calculates the discount based on a percentage.
     *
     * @param originalPrice The original price of the item
     * @param discountPercentage The discount percentage to be applied
     * @return The price after applying the discount
     */
    public static double calculatePercentageDiscount(double original, double discount) {
        if (original < 0 || discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Invalid price or discount percentage");
        }
        return original - (original * (discount / 100));
    }

    /**
     * Calculates the discount based on a fixed amount.
     *
     * @param originalPrice The original price of the item
     * @param discountAmount The fixed discount amount to be applied
     * @return The price after applying the discount
     */
    public static double calculateFixedAmountDiscount(double original, double discount) {
        if (original < 0 || discount < 0 || discount > original) {
            throw new IllegalArgumentException("Invalid price or discount amount");
        }
        return original - discount;
    }
}