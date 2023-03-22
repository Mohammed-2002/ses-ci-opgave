package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try{
           double num1 = scanner.nextDouble();
           double num2 = scanner.nextDouble();
        Calculator calculator = new Calculator(num1, num2);
            System.out.println("Sum: " + calculator.getSommatie());
        }
        catch (NumberFormatException e){
            System.out.println("Error: Please provide valid numbers as arguments.");
            return;
        }

    }
}