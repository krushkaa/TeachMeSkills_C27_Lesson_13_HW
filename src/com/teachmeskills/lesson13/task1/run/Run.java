package com.teachmeskills.lesson13.task1.run;

import com.teachmeskills.lesson13.task1.service.LogInCheckService;

public class Run {
    public static void main(String[] args) {
        LogInCheckService.logInCheck("Kirill", "QWERTY777", "QWERTY777");
        System.out.println("Thank you for registration.");
    }
}
