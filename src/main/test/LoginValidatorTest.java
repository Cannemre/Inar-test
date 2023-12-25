package main.test;

import main.java.LoginValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginValidatorTest {
    LoginValidator loginValidator = new LoginValidator();

    @Test
    void validEmailAddressTest() {
        boolean result = loginValidator.validateUsername("ecan18@icloud.com");
        assertEquals(true, result);
    }
    @Test
    void validEmailAddressWithoutTest() {
        boolean result = loginValidator.validateUsername("ecan18icloud.com");
        assertEquals(false, result);
    }
    @Test
    void validEmailAddressWithoutDomainTest() {
        boolean result = loginValidator.validateUsername("ecan18@");
        assertEquals(false, result);
    }
    @Test
    void validEmailAddressWithInvalidCharactersTest() {
        boolean result = loginValidator.validateUsername("ecan-,?/18@icloud,-com");
        assertEquals(false, result);
    }
    @Test
    void validEmptyEmailAddressTest() {
        boolean result = loginValidator.validateUsername("");
        assertEquals(false, result);
    }
    @Test
    void validNullEmailAddressTest() {
        boolean result = loginValidator.validateUsername(null);
        assertEquals(false, result);
    }

    @Test
    void validatePasswordTest() {
        boolean result = loginValidator.validatePassword("a2sdasd.1");
        assertEquals(true, result);
    }
    @Test
    void validatePasswordWithoutSpecialCharacterTest() {
        boolean result = loginValidator.validatePassword("asdasd112");
        assertEquals(false, result);
    }
    @Test
    void validatePasswordWithoutNumberTest() {
        boolean result = loginValidator.validatePassword("asdasd.sda");
        assertEquals(false, result);
    }
    @Test
    void validatePasswordTooShortTest() {
        boolean result = loginValidator.validatePassword("ad.11ad");
        assertEquals(false, result);
    }
    @Test
    void validatePasswordTooLongTest() {
        boolean result = loginValidator.validatePassword("asdasd.11asdascqw");
        assertEquals(false, result);
    }
    @Test
    void validateEmptyPasswordTest() {
        boolean result = loginValidator.validatePassword("");
        assertEquals(false, result);
    }
    @Test
    void validateNullPasswordTest() {
        boolean result = loginValidator.validatePassword(null);
        assertEquals(false, result);
    }
}