package com.teachmeskills.lesson13.task1.validator;

import com.teachmeskills.lesson13.task1.consts.Constants;
import com.teachmeskills.lesson13.task1.exceptions.WrongLoginException;
import com.teachmeskills.lesson13.task1.exceptions.WrongPasswordException;

public class InputValidator implements Constants {

    public static boolean checkInputParameters(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() > Constants.LOGIN_LENGTH_MAX) {
            throw new WrongLoginException("Your login is too long. " +
                    "The length of the login must be less than 20 characters. Please try again.");
        } else if (login.contains(" ")) {
            throw new WrongLoginException("The login must not contain a space.");
        } else if (password.length() > Constants.PASSWORD_LENGTH_MAX) {
            throw new WrongPasswordException("Your password is too long. " +
                    "The length of the password must be less than 20 characters. Please try again.");
        } else if (password.contains(" ")) {
            throw new WrongPasswordException("The password must not contain a space.");
        } else if (!checkPasswordChar(password)) {
            throw new WrongPasswordException("Password need contain at least 1 number.");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Wrong field 'confirmPassword', check and try again.");
        }
        return true;
    }

    private static boolean checkPasswordChar(String password) {
        char[] strCharArray = password.toCharArray();
        if (strCharArray.length <= PASSWORD_LENGTH_MAX) {
            for (char c : strCharArray) {
                if (Character.isDigit(c)) {
                    return true;
                }
            }
        }
        return false;
    }
}

