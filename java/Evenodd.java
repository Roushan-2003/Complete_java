//Evenodd

import java.util.Scanner;

public class Evenodd{
	public static void main(String[] args){
		
		//Scanner object to take input
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a number: ");
		int number = sc.nextInt();  //take input from user.
		
		if(number % 2 == 0){
			System.out.print("The number is even!!!");
		} else {
			System.out.print("The number is odd!!!");
		}

		sc.close();
	}
}
