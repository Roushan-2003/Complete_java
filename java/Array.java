/* 

    public class Array{
        public static void main(String[] args) {
        
            // making array
            // int[] marks = new int[3]; both syntax are correct.
            // int marks[] = new int[3];
            // marks[0]=97;
            // marks[1]=98;
            // marks[2]=99;
            // System.out.println(marks[0]);
            // System.out.println(marks[1]);
            // System.out.println(marks[2]);
            // we can also declare variables like
            int marks[]= {97,98,99};

            //using loop method print many data or value
            for(int i = 0; i<3; i++){
                System.out.println(marks[i]);
            }
        }
    }
    
 */
/* 
    // by taking input from user

import java.util.*;
public class Array{
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        // input
           System.out.println("Enter the numbers: ");
        for (int i=0; i<size; i++){
            // System.out.println("Enter the numbers: ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("The numbers are: ");
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }
}
*/


//Take input from user, and list the array of numbers

import java.util.Scanner;

public class Array{
    public static void main (String[] args){
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        System.out.println("Enter the numbers: ");
        for(int i = 0; i<size; i++){
            numbers[i]= sc.nextInt();
        }

        // output
        System.out.println("The numbers are: ");
        for(int i = 0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }
    }
