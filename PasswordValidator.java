package ru.tinkoff.fintech;

public class PasswordValidator {
    public String validatePassword(String password)
    {
        if (password.length() > 15 || password.length() < 8)
        {
            return "Password length must be from 8 to 15 symbols";
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars ))
        {
            return "Password must have at least one uppercase character";
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars ))
        {
            return "Password must have at least one lowercase character";
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers ))
        {
            return "Password must have at least one number";
        }
        String specialChars = "(.*[@,#,$,%].*$)";
        if (!password.matches(specialChars ))
        {
            return "Password must have at least one special character among @#$%";
        }
        return "password is valid";
    }
}
