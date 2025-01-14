package com.example;

public class DiscountCalculator {

    public static double calculatePercentageDiscount(double original, double discount) {
        if (original < 0 || discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Invalid price or discount percentage");
        }
        return original - (original * (discount / 100));
    }

    public static double calculateFixedAmountDiscount(double original, double discount) {
        if (original < 0 || discount < 0 || discount > original) {
            throw new IllegalArgumentException("Invalid price or discount amount");
        }
        return original - discount;
    }
}