package com.teachmeskills.lesson13.task1.service;

import com.teachmeskills.lesson13.task1.exceptions.WrongLoginException;
import com.teachmeskills.lesson13.task1.exceptions.WrongPasswordException;
import com.teachmeskills.lesson13.task1.validator.InputValidator;

public class LogInCheckService {
    public static void logInCheck (String login, String password, String confirmPassword){
        try {
            InputValidator.checkInputParameters(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Another error");
        }
        try {
            if (InputValidator.checkInputParameters(login, password, confirmPassword)) {
                System.out.println("The user has been successfully registered.");
            }
        } catch (WrongLoginException|WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}
