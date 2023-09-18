package org.launchcode;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        Divide(8, 0);
//        int x = 8;
//        int y = 0;
//
//        Divide(x, y);


//        HashMap<String, String> studentFiles = new HashMap<>();
//        studentFiles.put("Carl", "Program.java");
//        studentFiles.put("Brad", "");
//        studentFiles.put("Elizabeth", "MyCode.java");
//        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }


    public static void Divide(int x, int y) {
        try {
            int grade = x / y;
            System.out.println("The student's grade is: " + grade);
        } catch (ArithmeticException e)
        {
            System.out.println("You cannot divide by zero!");
        }
            }

    }


//        System.out.println(z);


//    public static int CheckFileExtension(String fileName) {
//
//        return;   // Write code here!
//    }



