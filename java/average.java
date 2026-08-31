// import java.util.*;

// public class average {

//     // Function to calculate and print average
//     static void Average(int a, int b, int c) {
//         double avg = (a + b + c) / 3.0;
//         System.out.println("Average = " + avg);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();

//         System.out.print("Enter third number: ");
//         int num3 = sc.nextInt();

//         Average(num1, num2, num3);
//     }
// }

import java.util.*;

public class average {
    
    //Function to calculate and print average
    static void Average(int a, int b, int c){
        double avg = (a + b + c)/3.0;
        System.out.println("Average= " + avg);
    }

    public static void  main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        Average(num1, num2, num3);

        sc.close();
    }
}