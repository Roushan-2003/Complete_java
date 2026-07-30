/* 
import java.util.*;
public class plaindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;

        }
        if (original == reverse) {
            System.out.println(original + " is a palindrome number.");

        }else{
            System.out.println(original + " is Not a Palindrome number.");

        }
        sc.close();
    }
        
}

*/ 


// rivision:
import java.util.*;
public class palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if (original == reverse){
            System.out.print(original + " is a palindrome Number");
        }else{
            System.out.print(original + " is not a palindrome Number");
        }
        sc.close();
    }
}

