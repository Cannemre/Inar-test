package main.test;

import main.java.LoginValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginValidatorTest {
    LoginValidator loginValidator = new LoginValidator();

    @Test
    void validEmailAddressTest() {
        boolean result = loginValidator.validateUsername("ecan18@icloud.com");
        assertTrue(result);
    }
    @Test
    void validEmailAddressWithoutTest() {
        boolean result = loginValidator.validateUsername("ecan18icloud.com");
        assertFalse(result);
    }
    @Test
    void validEmailAddressWithoutDomainTest() {
        boolean result = loginValidator.validateUsername("ecan18@");
        assertFalse(result);
    }
    @Test
    void validEmailAddressWithInvalidCharactersTest() {
        boolean result = loginValidator.validateUsername("ecan-,?/18@icloud,-com");
        assertFalse(result);
    }
    @Test
    void validEmptyEmailAddressTest() {
        boolean result = loginValidator.validateUsername("");
        assertFalse(result);
    }
    @Test
    void validNullEmailAddressTest() {
        boolean result = loginValidator.validateUsername(null);
        assertFalse(result);
    }

    @Test
    void validatePasswordTest() {
        boolean result = loginValidator.validatePassword("a2sdasd.1");
        assertTrue(result);
    }
    @Test
    void validatePasswordWithoutSpecialCharacterTest() {
        boolean result = loginValidator.validatePassword("asdasd112");
        assertFalse(result);
    }
    @Test
    void validatePasswordWithoutNumberTest() {
        boolean result = loginValidator.validatePassword("asdasd.sda");
        assertFalse(result);
    }
    @Test
    void validatePasswordTooShortTest() {
        boolean result = loginValidator.validatePassword("ad.11ad");
        assertFalse(result);
    }
    @Test
    void validatePasswordTooLongTest() {
        boolean result = loginValidator.validatePassword("asdasd.11asdascqw");
        assertFalse(result);
    }
    @Test
    void validateEmptyPasswordTest() {
        boolean result = loginValidator.validatePassword("");
        assertFalse(result);
    }
    @Test
    void validateNullPasswordTest() {
        boolean result = loginValidator.validatePassword(null);
        assertFalse(result);
    }
}