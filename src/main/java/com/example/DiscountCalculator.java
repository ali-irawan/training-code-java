package com.example;

public class DiscountCalculator {

    public static double calculatePercentageDiscount(double o, double d) {
        if (o < 0 || d < 0 || d > 100) {
            throw new IllegalArgumentException("Invalid price or discount percentage");
        }
        double result = o - (o * (d / 100));
        if (result < 0) {
            result = 0;
        }
        return result;
    }

    public static double calculateFixedAmountDiscount(double o, double d) {
        if (o < 0 || d < 0 || d > o) {
            throw new IllegalArgumentException("Invalid price or discount amount");
        }
        double result = o - d;
        if (result < 0) {
            result = 0;
        }
        return result;
    }

    public static double complexDiscountCalculation(double o, double d1, double d2, boolean isPercentage) {
        double result;
        if (isPercentage) {
            result = calculatePercentageDiscount(o, d1);
            if (result < 50) {
                result = calculateFixedAmountDiscount(result, d2);
                if (result < 20) {
                    result = result + 5;
                }
            }
        } else {
            result = calculateFixedAmountDiscount(o, d1);
            if (result < 50) {
                result = calculatePercentageDiscount(result, d2);
                if (result < 20) {
                    result = result + 5;
                }
            }
        }
        return result;
    }

    // Duplicate code
    public static double duplicateMethod(double o, double d) {
        if (o < 0 || d < 0 || d > 100) {
            throw new IllegalArgumentException("Invalid price or discount percentage");
        }
        double result = o - (o * (d / 100));
        if (result < 0) {
            result = 0;
        }
        return result;
    }

    // Security issue: Hardcoded password
    public static void securityIssue() {
        String password = "hardcodedPassword123";
        System.out.println("Using hardcoded password: " + password);
    }

    // Unused variable
    public static void unusedVariable() {
        int unused = 42;
    }
}