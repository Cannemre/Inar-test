package main.test;

import main.java.AgeRestrictionValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeRestrictionValidatorTest {
    AgeRestrictionValidator ageValidator = new AgeRestrictionValidator();

    @Test
    void ageJustBelowMinimum() {
        boolean result = ageValidator.isEligible(17);
        assertEquals(false, result);
    }
    @Test
    void ageAtMinimumBoundary() {
        boolean result = ageValidator.isEligible(18);
        assertEquals(true, result);
    }
    @Test
    void ageJustAboveMinimum() {
        boolean result = ageValidator.isEligible(19);
        assertEquals(true, result);
    }
    @Test
    void ageJustBelowMaximum() {
        boolean result = ageValidator.isEligible(64);
        assertEquals(true, result);
    }
    @Test
    void ageAtMaximumBoundary() {
        boolean result = ageValidator.isEligible(65);
        assertEquals(true, result);
    }
    @Test
    void ageJustAboveMaximum() {
        boolean result = ageValidator.isEligible(66);
        assertEquals(false, result);
    }
    @Test
    void extremeLowAge() {
        boolean result = ageValidator.isEligible(0);
        assertEquals(false, result);
    }
    @Test
    void extremeHighAge() {
        ageValidator.isEligible(100);
        boolean result = ageValidator.isEligible(100);
        assertEquals(false, result);
    }
}