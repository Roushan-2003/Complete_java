
// 1. Swap numbers Using Addition and Subtraction

// public class Swap {
//     public static void main(String args[]){
//          int a = 10;
//          int b = 20;

//          System.out.println("Before swap:");
//          System.out.println("a = "+ a + " b = " + b);

//          a= a+b;
//          b= a-b;
//          a= a-b;

//          System.out.println("After swap: ");
//          System.out.println("a = " + a + " b = "+ b);

//     }
    
// }
// Note: This method can cause integer overflow if a + b exceeds the int range.


// 2. Using Multiplication and Division
/* 
public class Swap{
    public static void main(String args[]){
        int a = 5;
        int b = 20;
        
        System.out.println("Before swaping:");
        System.out.println("a = " + a + " b = " + b);

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("After swaping:");
        System.out.println("a = " + a + " b = " + b);
    }
}
Note: This method does not work if either number is 0.
*/

// 3. Using XOR Bitwise Operator (Best for Interviews)

public class Swap{
    public static void main(String args[]){
        int a = 10;
        int b = 20;

        a = a ^ b;  /*Variable a now holds the combined bit pattern of both original a and b using the XOR (exclusive OR) operation.*/
        b = a ^ b;  /*Variable b gets the value of the original a because (original a ^ b) ^ original b cancels out b. */
        a = a ^ b;  /*Variable a gets the value of the original b because the new a combined with the new b leaves just a.*/

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // The Rule Table
        // Here is how XOR works for every possible combination:
        // 0 XOR (^) 0 = 0 (The same,  so 0)
        // 1 XOR (^) 1 = 0 (The same,  so 0)
        // 1 XOR (^) 0 = 1 (Different, so 1)
        // 0 XOR (^) 1 = 1 (Different, so 1)

    }
}


 