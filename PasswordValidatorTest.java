package ru.tinkoff.fintech;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {
    @Test
    public void uncorrectFirstLengthPasswordTest () {
        PasswordValidator password = new PasswordValidator();
        String stringName = "0123456";
        String expectedRes = "Password length must be from 8 to 15 symbols";

        String actualRes = password.validatePassword(stringName);

        Assertions.assertEquals(expectedRes, actualRes);
    }
    @Test
    public void uncorrectSecondLengthPasswordTest () {
        PasswordValidator password = new PasswordValidator();
        String stringName = "";
        String expectedRes = "Password length must be from 8 to 15 symbols";

        String actualRes = password.validatePassword(stringName);

        Assertions.assertEquals(expectedRes, actualRes);
    }
    @Test
    public void uncorrectThirstLengthPasswordTest () {
        PasswordValidator password = new PasswordValidator();
        String stringName = "0123456789123456";
        String expectedRes = "Password length must be from 8 to 15 symbols";

        String actualRes = password.validatePassword(stringName);

        Assertions.assertEquals(expectedRes, actualRes);
    }
    @Test
    public void uncorrectFirstUpperCaseCharsPasswordTest () {
        PasswordValidator password = new PasswordValidator();
        String stringName = "0123456789abc";
        String expectedRes = "Password must have at least one uppercase character";

        String actualRes = password.validatePassword(stringName);

        Assertions.assertEquals(expectedRes, actualRes);
    }
    @Test
    public void uncorrectSecondUpperCaseCharsPasswordTest () {
        PasswordValidator password = new PasswordValidator();
        String stringName = "0123456789А";
        String expectedRes = "Password must have at least one uppercase character";

        String actualRes = password.validatePassword(stringName);

        Assertions.assertEquals(expectedRes, actualRes);
    }
    @Test
    public void uncorrectLowerCaseCharsPasswordTest () {
        PasswordValidator password = new PasswordValidator();
        String stringName = "0123456789ABC";
        String expectedRes = "Password must have at least one lowercase character";

        String actualRes = password.validatePassword(stringName);

        Assertions.assertEquals(expectedRes, actualRes);
    }
    @Test
    public void uncorrectNumberPasswordTest () {
        PasswordValidator password = new PasswordValidator();
        String stringName = "abcABCdght#";
        String expectedRes = "Password must have at least one number";

        String actualRes = password.validatePassword(stringName);

        Assertions.assertEquals(expectedRes, actualRes);
    }
    @Test
    public void uncorrectSpecialCharsPasswordTest () {
        PasswordValidator password = new PasswordValidator();
        String stringName = "abcABCdght12";
        String expectedRes = "Password must have at least one special character among @#$%";

        String actualRes = password.validatePassword(stringName);

        Assertions.assertEquals(expectedRes, actualRes);
    }
    @Test
    public void correctPasswordTest () {
        PasswordValidator password = new PasswordValidator();
        String stringName = "abcABCdg$ht12";
        String expectedRes = "password is valid";

        String actualRes = password.validatePassword(stringName);

        Assertions.assertEquals(expectedRes, actualRes);
    }
}