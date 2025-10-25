// if, else statement

/* import java.util.*;

public class conditions{
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in); 

		System.out.print("Enter Age: ");
		int Age = sc.nextInt();


		if(Age > 18) {
			System.out.println("Adult");
		}else{
			System.out.println("Not Adult");
		}
	}
}
*/ 

// if condition using operator.

/* import java.util.*;

public class conditions{
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();

		if(num % 2 == 0) {
		System.out.print("Given number is Even.");
		}else{
		System.out.print("Given number is Odd.");
		}
		sc.close();
	}
}

*/


//Checking multiple numbers with conditions

/* import java.util.*;

public class conditions {
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();

		if (a == b) {
			System.out.print(" Equal.");
		} else if(a > b){
			System.out.print("a is Greater.");
		} else {
			System.out.print("b is Greater.");
		}
	
	
	}
}  */


// for applying Switch.




import java.util.*;
public class conditions{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the your choice: ");
		int button = sc.nextInt();
		
		switch(button) {
			case 1: System.out.println("Hello");
			break;
			case 2: System.out.println("Namaste");
			break;
			case 3: System.out.println("Bonjour");
			break;
			default: System.out.println("Invalid Button");
		}
	
	}
	}























