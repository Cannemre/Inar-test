package main.test;

import main.java.AgeRestrictionValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeRestrictionValidatorTest {
    AgeRestrictionValidator ageValidator = new AgeRestrictionValidator();

    @Test
    void ageJustBelowMinimum() {
        boolean result = ageValidator.isEligible(17);
        assertFalse(result);
    }
    @Test
    void ageAtMinimumBoundary() {
        boolean result = ageValidator.isEligible(18);
        assertTrue(result);
    }
    @Test
    void ageJustAboveMinimum() {
        boolean result = ageValidator.isEligible(19);
        assertTrue(result);
    }
    @Test
    void ageJustBelowMaximum() {
        boolean result = ageValidator.isEligible(64);
        assertTrue(result);
    }
    @Test
    void ageAtMaximumBoundary() {
        boolean result = ageValidator.isEligible(65);
        assertTrue(result);
    }
    @Test
    void ageJustAboveMaximum() {
        boolean result = ageValidator.isEligible(66);
        assertFalse(result);
    }
    @Test
    void extremeLowAge() {
        boolean result = ageValidator.isEligible(0);
        assertFalse(result);
    }
    @Test
    void extremeHighAge() {
        ageValidator.isEligible(100);
        boolean result = ageValidator.isEligible(100);
        assertFalse(result);
    }
}