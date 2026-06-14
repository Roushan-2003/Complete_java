// Write a program that takes user input and performs basic arithmetic.abstract 

import java.util.Scanner;

public class ArithmeticOperations {
    
    public static void main(String[] agrs){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Addition = " + (a+b));
        System.out.println("Subtraction = " + (a-b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a/b));
        System.out.println("Modulus = " + (a % b));

        sc.close();

    }

}

// Explanation
// Scanner takes user input.
// + - * / % are arithmetic operators.
