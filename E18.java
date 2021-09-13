/*
        *  UCF COP3330 Fall 2021 Assignment 18 Solution
        *  Copyright 2021 Nick Cook
        */

import java.util.Scanner;



public class E18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Press 1 to convert from Fahrenheit  to Celsius.");
        System.out.println("Press 2 to convert from Celsius to Fahrenheit .");
        System.out.print("Your choice: ");
        int num = scan.nextInt();

        if(num == 1) {
            System.out.print("Please enter the temperature in Fahrenheit : ");
            int fah;
            int newtemp;
            fah = scan.nextInt();
            newtemp = (fah - 32) * 5 / 9;
            System.out.print("The temperature in Celsius is "+ newtemp+".");
        }
        else if(num == 2) {
            int cel;
            int newtemp1;
            System.out.print("Please enter the temperature in Celsius: ");
            cel = scan.nextInt();
            newtemp1 = (cel * 9 / 5) + 32;
            System.out.print("The temperature in Fahrenheit  is "+ newtemp1+".");
        }
        else {
            System.out.println("Wrong Input!!!");

        }
    }
}
