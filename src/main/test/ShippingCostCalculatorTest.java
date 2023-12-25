package main.test;

import main.java.ShippingCostCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShippingCostCalculatorTest {
    ShippingCostCalculator shippingCostCalculator = new ShippingCostCalculator();

    @Test
    void localDestinationWithStandardDelivery() {
        double result = shippingCostCalculator.calculateCost(10, "local", "standard");
        assertEquals(10, result);
    }

    @Test
    void localDestinationWithExpressDelivery() {
        double result = shippingCostCalculator.calculateCost(10, "local", "express");
        assertEquals(25, result);
    }

    @Test
    void internationalDestinationWithStandardDelivery() {
        double result = shippingCostCalculator.calculateCost(10, "international", "standard");
        assertEquals(50, result);
    }

    @Test
    void internationalDestinationWithExpressDelivery() {
        double result = shippingCostCalculator.calculateCost(10, "international", "express");
        assertEquals(125, result);
    }

    @Test
    void zeroWeightLocalStandardDelivery() {
        double result = shippingCostCalculator.calculateCost(0, "local", "standard");
        assertEquals(0, result);
    }

    @Test
    void zeroWeightLocalExpressDelivery() {
        double result = shippingCostCalculator.calculateCost(0, "local", "express");
        assertEquals(0, result);
    }

    @Test
    void zeroWeightInternationalStandardDelivery() {
        double result = shippingCostCalculator.calculateCost(0, "international", "standard");
        assertEquals(0, result);
    }

    @Test
    void zeroWeightInternationalExpressDelivery() {
        double result = shippingCostCalculator.calculateCost(0, "international", "express");
        assertEquals(0, result);
    }

    @Test
    void negativeWeightLocalStandardDelivery() {
        double result = shippingCostCalculator.calculateCost(-1, "local", "standard");
        assertEquals(-1, result);
    }

    @Test
    void negativeWeightLocalExpressDelivery() {
        double result = shippingCostCalculator.calculateCost(-1, "local", "express");
        assertEquals(-2.5, result);
    }

    @Test
    void negativeWeightInternationalStandardDelivery() {
        double result = shippingCostCalculator.calculateCost(-1, "international", "standard");
        assertEquals(-5, result);
    }

    @Test
    void negativeWeightInternationalExpressDelivery() {
        double result = shippingCostCalculator.calculateCost(-1, "international", "express");
        assertEquals(-12.5, result);
    }

}