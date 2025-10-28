import java.util.*;

public class AverageCalculator{
	//Functions to calculate average 
	static double calculateAverage(double a, double b, double c) {
		double average = (a+b+c)/3;
		return average;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//taking 3 number as input from the user
		System.out.print("Enetr first number: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Enter second number: ");
		double num2 = sc.nextDouble();
		
		System.out.print("Enter third number: ");
		double num3 = sc.nextDouble();
		
		//calling the  functions
		double result = calculateAverage(num1, num2, num3);
		
		//Printing the results
		System.out.println("The Average of the three numbers is : " + result);
		
		sc.close();
	}
}


