// we will learn about Functions

// Q.1)Print a given name
/* 
import java.util.*;

public class Functions {
    public static void printMyName(String name) {
        System.out.println( name);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        printMyName(name); //call kiya function ko
    }

}
*/

/*
// Q.2) Make a Function to add 2 numbers and return the sum.

import java.util.*;

public class Functions{
    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("The Sum is: " + sum);

    }
}
*/

/* 
// Q.3)Make a function to multiply 2 numbers and return the product.

import java.util.*;
public class Functions {
    public static int calculateProduct(int a, int b) {
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Product of 2 number is: "+ calculateProduct(a, b));
        sc.close();
    }

}
*/

// Q.4) Find the Factorial of a number.
//  n!= n*(n-1)*(n-2)*(n-3)....*1
//  by default 0! = 1 and there is no factorial for negative numbers
// 1! = 1
// 2! = 2*1 = 2
// 3! = 3*2*1 = 6
// 4! = 4*3*2*1 = 24
// nd so on..

import java.util.*;
public class Functions {
    public static void printFactorial(int n){
        //loop
        if(n<0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for(int i = n; i>=1 ;i--){
            factorial = factorial * i;
            
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Factorial is: ");
        printFactorial(n);
    }
}
