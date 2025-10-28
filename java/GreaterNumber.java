import java.util.*;

public class GreaterNumber {

	//function to find the greater of the two numbers
	static int findGreater(int a, int b) {
		if (a > b){
			return a;
		}else {
			return b;
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Taking input
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		//calling the function
		int greater = findGreater(num1, num2);
		
		//print the result
		System.out.println("The greater number is : " + greater);
		
		sc.close();
	}
}
		
	