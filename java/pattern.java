//pattern
//solid Rectangle
//nested loops

/*
import java.util.*;
	public class pattern{
		public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
			int h = sc.nextInt();
			int v = sc.nextInt();
			for (int i = 1; i<=h; i++){
				for(int j=1; j<=v; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	}
	*/
/*	hollow pattern
import java.util.*;
	public class pattern{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			for(int i=1; i<=n ;i++){
				for(int j=1; j<=m ;j++){
					if(i==1 || j == 1 || i==n || j==m){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
*/				
					
/*//pyramid pattern				
import java.util.*;
	public class pattern{
		public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
			int n =  sc.nextInt();
			
			for(int i= 1;i<=n;i++){
				for(int j= 1;j<=i;j++){
					System.out.print("@");
				}
				System.out.println();
			}
		}
	}
	
*/
/*
import java.util.*;
	public class pattern{
		public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
			int n =  sc.nextInt();
			
			for(int i=n;i>=1;i--){
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
	*/
/*
import java.util.*;
	public class pattern{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			//outter loops for new line
			for(int i=1;i<=n;i++){
				
				//inner loops for space
				for(int j = 1; j <= n-i; j++){
					System.out.print(" ");
				}
				
				//inner loop for stars printing
				for(int j = 1; j<=i; j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
*/
/*
//print the pattern

import java.util.*;
		public class pattern{
			public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			//outter loop for row
			for(int i = 1; i<=n ;i++){
				
				//inner loop for printing number
				for(int j=1;j<=i;j++){
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
		
	}
*/

/*
//reverse pattern of numbers
import java.util.*;
	public class pattern{
		public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			//Outter loop
			for(int i=1;i<=n;i++){
			
				//inner loop
				for(int j=1; j<=n-i+1; j++){
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
	}
*/
/*
//Floyd's triangle
import java.util.*;
	public class pattern{
		public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int num = 1 ;
			
			//outter loop
			for(int i = 1; i<=n; i++){
				//inner loop
				for(int j=1; j<=i; j++){
					System.out.print(num + " ");
					num++;
				}
				System.out.println();
			}
		}
	}
*/
/*
//zero and one triangle
	public class pattern{
		public static void main(String args[]){
			
			
			int n = 5;
			
			//outter loop
			for(int i=1; i<=n; i++){
				
				//inner loop
				for(int j=1; j<=i; j++){
					int sum = i+j;
					if(sum % 2 == 0){
						//even
						System.out.print("1");
					}else{
						System.out.print("0");
					}
				}
				System.out.println();
			
			}
		}
	}		
*/

/*
//Advance java.
//butterfly printing
import java.util.*;

public class pattern {
	public static void main(String args[]) {
		int n = 10;
		
		//upper half 
		for(int i = 1; i<=n; i++) {
			//1st part
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			//Spaces
			int spaces = 2 * (n-i);
			for  (int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			
			//2nd  part
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = n; i>=1; i--) {
			//1st part
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			//Spaces
			int spaces = 2 * (n-i);
			for  (int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			
			//2nd  part
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
*/


/*
//Solid Rhombus

import java.util.*;
	public class pattern{
		public static void main(String args[]){
			int n = 5;
			
			for (int i=1;i<=n;i++) {
				//spaces
				for(int j=1; j<=n-i; j++) {
					System.out.print(" ");
				}
				
				//stars
				for(int j=1; j<=n; j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
*/

//make hollow rhombus home work.
/*
//printing  pyramid number.
import java.util.*;
	public class pattern{
		public static void main(String args[]){
			
			int n = 5;
			
			for(int i=1;i<=n;i++){
			//spaces
			for(int j=1; j<=n-i;j++){
				System.out.print(" ");
			}
			//numbers -> print row no, row no. times
			
			for(int  j=1; j<=i ;j++){
				System.out.print(i + " ");
			}
			System.out.println();
		}
		}
	}
*/
/*
import java.util.*;
	public class pattern{
		public static void main(String args[]){
			
			int n = 5;
			for (int i=1;i<=n;i++){
				
				//spaces
				for (int j=1; j<=n-i; j++){
					System.out.print(" ");
				}
				//1st half numbers
				for(int j=i; j>=1;j--){
					System.out.print(j);
				}
				//2nd half numbers
				for(int j=2; j<=i; j++){
					System.out.print(j);
				}
				System.out.println();
			}
	    }
	}
*/

import java.util.*;
	public class pattern{
		public static void main(String args[]){
			
			int n = 4;
			
			//upper  half
			for(int i=1; i<=n; i++){
				//spaces 
				for(int j=1; j<=n-1; j++){
					System.out.print(" ");
				}
				
				//stars
				for(int j=1; j<=2*i-1; j++){
					System.out.print("*");
				}
				System.out.println();
			}
			 
			for(int i=n; i>=1; i--){
				//spaces 
				for(int j=1; j<=n-1; j++){
					System.out.print(" ");
				}
				
				//stars
				for(int j=1; j<=2*i-1; j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
	