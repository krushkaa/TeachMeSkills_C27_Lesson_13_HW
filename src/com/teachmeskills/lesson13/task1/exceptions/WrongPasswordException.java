package com.teachmeskills.lesson13.task1.exceptions;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(){}
    public WrongPasswordException (String message){
        super (message);
    }
}
