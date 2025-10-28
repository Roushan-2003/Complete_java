import java.util.*;
public class SumOfOddNumbers{
	
	// function to calculate all the odd numbers from 1 to n;
	
	static int sumOfOdds(int n) {
		int sum = 0;
		for(int i=0; i<=n ; i++){
			if(i % 2 != 0) {//check if the number is odd
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		//take input from user
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int result =  sumOfOdds(n);
		System.out.println("The sum of odd numbers from 1 to "+ n +" is : "+ result);
	}
}

