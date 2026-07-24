/*
// 1. Basic Level (Using Scanner)


import java.util.*;

public class UserInput{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name=sc.nextLine();

        System.out.print("Hello "+ name);

        sc.close();
    }
}

*/



/* 
// 2. Intermediate Level (Taking Different Data Types), print name, age, salary, is student?

import java.util.*;

public class UserInput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your age: ");
        int age = sc.nextInt();

        System.out.print("Enter Your salary: ");
        double salary = sc.nextDouble();
        
        System.out.print("Are you a Student(True/false): ");
        boolean student = sc.nextBoolean();

        System.out.println("\n ------User Details------");
        System.out.println("Name        : "+ name);
        System.out.println("Age         : "+ age);
        System.out.println("Salary      : "+ salary);
        System.out.println("Student     : "+ student);

        sc.close();

        }
    }
 */ 


// 3. Advanced Level (Menu-Driven Input with Validation)
/* 
Interview/Assignment Style

Problem Statement:

Create a Java program to perform user input validation.

Requirements:

Accept the user's name.
Accept the user's age.
Validate that the age is:
a numeric value (int)
greater than 0
If invalid input is entered (non-numeric or non-positive), display an error message and prompt the user again.
Display the user's information after successful validation.

*/

import java.util.*;

public class UserInput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Enter Your name : ");
        name = sc.nextLine();
        
        while(true){
            System.out.println("Enter your age: ");

            if (sc.hasNextInt()){
                age= sc.nextInt();

                if (age > 0){
                    break;
                }else{
                    System.out.println("Age must be greater than 0.");
                }
            }else{
                System.out.println("Invalid input! Please enter a number");
                sc.next(); //Remove invalid input
            }

        }
        System.out.println("\n====== User Information ======");
        System.out.println("Name : "+name);
        System.out.println("Age  : "+age);

        sc.close();
    }
}