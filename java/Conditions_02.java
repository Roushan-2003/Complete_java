/* CODE_01
import java.util.*;

public class Conditions_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("AGE of the Person: ");
		int age = sc.nextInt();
		
		if (age > 18) {
			System.out.println("Adult");
			} else {
			System.out.println("Not Adult");
			}
		}
	}	
*/


/* CODE_02

import java.util.*;

public class Conditions_02{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Give the number: ");
			int num = sc.nextInt();
			
			if (num % 2 == 0) {
				System.out.println("The number is even.");
			}else {
				System.out.println("The Numebr is Odd.");
			}
		}
}
*/	


//check whether the number a and b are equal, a>b, a<b
/* CODE_03

import java.util.*;
	
	public class Conditions_02{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a:");
			int a = sc.nextInt();
			System.out.print("Enter b:");
			int b = sc.nextInt();
			
			if (a == b) {
				System.out.println("a and b are Equal");
			}else {
				if(a>b){
					System.out.println("a is Greater");
				}else{
					System.out.println("a is Lesser and b is Greater");
				}
			}
		}
	}	
*/

/*
import java.util.*;
	
	public class Conditions_02{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a:");
			int a = sc.nextInt();
			System.out.print("Enter b:");
			int b = sc.nextInt();
			
			if (a == b) {
				System.out.println("a and b are Equal");
			}else if(a>b){
					System.out.println("a is Greater");
			}else{
					System.out.println("a is Lesser and b is Greater");
			}
		}
	}	
	kgui
*/


import java.util.*;
	public class Conditions_02{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your choice : ");
			int button = sc.nextInt();
			
			switch(button) {
				case 1: System.out.println("You are Beautiful.");
				break;
				case 2: System.out.println("You are very veryy Beautiful.");
				break;
				case 3: System.out.println("you are like, jisse chaand bhi dekh jalne lage.");
				break;
				default : System.out.println("Aise to mai sakt launda hu, bass yaha mai pighal gaya..");
			}
		}
	}






















































