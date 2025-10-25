//Loops: for loop, while loop, do while loop.

/* for loop syntax: for (initialisation; condition; updation) {
   // do something
} */

/*

public class Loops {
	public static void main(String[]  args) {
		
		for( int counter = 0; counter < 100; counter = counter+1) {
			System.out.println("Hello Supriya jii");
		} 
	}

} */

/*
//for loop
public class Loops{
	public static void main(String[] args) {
		//counter++ => counter = counter + 1, we can also use alphabets instead of counter 
		
		for(int i = 0; i < 11; i++){
		System.out.println(i + " ");
		}
	}
}
*/

/*
//while loop

public class Loops{
	public static void main(String[] args){
		int i = 0;
		while(i < 11){
		System.out.println(i);
		i = i + 1; //incrementing i, we can also write i++.
	 	}
	}
}
*/


/*
//print the sum of first n natural numbers.


import java.util.*;

public class Loops{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i=0; i<=n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}

*/


/*
//Print the table of a number input by the user.


import java.util.*;

public class Loops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the number: ");
		int n = sc.nextInt();

		
		for (int i=1; i<=10; i++) {
			System.out.println(n*i);
		}
		
	}
}


*/


/*
//Homework-1: infinite Loop

public class Loops{
	public static void main(String[] args) {
		
		for(; ;) {
			System.out.println("hello dear");
			}
		}
	}

*/

/*
//Homework: print all even numbers till n.

import java.util.*;
public class Loops{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		System.out.println("Even number from 1 to "+n+" : ");

		//Loop through numbers and check even
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0){
				System.out.println(i + " ");
		}
	}
	sc.close();
				
	}
}


*/

/* 
import java.util.*;

public class Loops{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		System.out.println("Even number from 1 to "+ n +" : ");
		
		//Loop through numbers and check even
		for(int i=1;i<=n;i++){
			if(i % 2 == 0){
				System.out.println(i +" ");
			}
		}
	}
}
		
*/ 


//Menu Driven Java Program:
/*
User enters 1 → program asks for marks repeatedly.

User enters 0 → program stops.

Based on marks, different messages are printed.

You mentioned do-while → this makes sense because we want to execute at least once before checking condition (menu-driven structure).

Here’s the Java Program 👇
*/

import java.util.*;
public class Loops{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice;

		do{
			System.out.println("Enter 1 to input marks or 0 to exit: ");
		   	choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.print("Enter student's marks (0-100): ");
				int marks = sc.nextInt();

				if (marks >= 90 && marks <=100) {
					System.out.println("This is Good."); 
				}else if(marks >= 60 && marks <= 89){
					System.out.println("This is also Good.");
				}else if(marks >=0 && marks <= 59){
					 System.out.println("This is Good as well");
                   			 System.out.println("Because marks don’t matter but our effort does.");
				}else{
					System.out.println("Invalid marks! please enter between 0 and 100.");
		}
	}
} while (choice != 0);

		System.out.println("Program Terminated.");
		sc.close();
	}
}

















