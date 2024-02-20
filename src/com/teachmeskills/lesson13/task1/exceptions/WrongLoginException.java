package com.teachmeskills.lesson13.task1.exceptions;

public class WrongLoginException extends Exception {
    public WrongLoginException(){

    }
    public WrongLoginException(String message){
        super (message);
    }
}
