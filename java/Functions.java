
/*
//Functions and methods
import java.util.*;

public class Functions {
	public static void printMyName(String name) {
		System.out.println( name);
		return;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		printMyName(name);//call kiya function ko
} 
}
*/

//function to display name.
import java.util.*;

public class Functions{
	public static void printMyName(String name) {
		System.out.println( name );
		return;
	}
	public static void main (String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the name: ");
		String name = sc.next();
		
		printMyName(name);
	}
}
/*
//Q2.print the sum of two numbers using functions

import java.util.*;

public class Functions {
	public static int calculateSum(int a, int b) {
		int sum = a + b;
		return sum;	
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1st no. : ");
		int a = sc.nextInt();
		
		System.out.print("Enter the 2nd no. : ");
		int b = sc.nextInt();
		
		int sum = calculateSum(a,b);
		System.out.println("sum of 2 numbers is: " + sum);
	}
}
*/


/*
//Q3. Make a Function to multiply  2 numbers and return the product.

import java.util.*;

public class Functions{
	public static int calculateProduct(int a, int b){
		int product = a * b;
		return product;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1st number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter the 2nd number: ");
		int b = sc.nextInt();
		
		int product = calculateProduct(a,b);
		System.out.print("Product of 2 number is:" + product);
	}
}
*/
/*
//with easier method
import java.util.*;

public class Functions{
	public static int calculateProduct(int a, int b){
		return a * b;
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1st number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter the 2nd number: ");
		int b = sc.nextInt();
		
		
		System.out.print("Product of 2 number is:" + calculateProduct(a,b));
	}
}
*/

/*
import java.util.*;

public class Functions{
	public static void printFactorial(int n){
	//loop
		if(n<0) {
			System.out.println("Invalid Number");
		return;
	}
		int factorial = 1;
	
		for(int i=n; i>=1; i--) {
			factorial  = factorial * i;
	}
		System.out.println(factorial);
		return;
}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:" );
		int n = sc.nextInt();
	
		printFactorial(n);
}
}
*/