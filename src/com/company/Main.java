package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        double d1, d2;

        try {
            System.out.print("Enter a numeric value: ");
            d1 = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter a numeric value: ");
            d2 = sc.nextDouble();
            sc.nextLine();

        } catch (InputMismatchException e) {
            System.out.println("You did not input a number.");
            return;
        }

        System.out.println("Select an operation (+ - * /): ");
        double result;
        var operations = sc.nextLine();

        switch (operations){
            case "+":
                result = d1 + d2;
                break;
            case "-":
                result = d1 - d2;
                break;
            case "*":
                result = d1 * d2;
                break;
            case "/":
                result = d1 / d2;
                break;
            default:
                System.out.println("You did not choose a valid operation.");
                return;
        }

        System.out.println("The answer is " + result);
    }

}

