/*
* UCF COP 3330 Fall 2021 Assignment 15 Solution
* Copyright 2021 Rahel Haque
 */


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner password = new Scanner(System.in);
        System.out.println("Enter a password");
        String password_in = password.next();

        System.out.println("What is your password?");
        String input = password.next();

        if(input.equals(password_in)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}