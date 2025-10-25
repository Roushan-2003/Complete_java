/*
//Take name ,age as input and print them

import java.util.Scanner; // Import Scanner class for input

public class takeinput{
	public static void main(String[] args) {

		//create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		//Prompt and read name
		System.out.print("Enter Your name: ");
		String name = sc.nextLine();

		//Prompt and read age
		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		//Print the input values
		System.out.println("Your name is: " + name);
		System.out.println("Your age is: " + age);

		sc.close(); //close the Scanner
	}
}

*/

import java.util.Scanner; // Import Scanner class for input

public class takeinput{
	public static void main(String[] args){
		
		//create scanner object to read input
		Scanner sc = new Scanner(System.in);

		//Prompt and read name
		System.out.print("Enter your name: ");
		String name = sc.nextLine();

		//Prompt and read age
		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		//Print the input values
		System.out.println("Your name is: " + name);
		System.out.println("Your age is: " + age);
		
		sc.close(); //close the Scanner
	}
}
















