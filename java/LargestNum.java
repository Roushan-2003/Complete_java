import java.util.*;

public class LargestNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st numbers: ");
        int a =  sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();

        System.out.println("Enter 3rd number : ");
        int c = sc.nextInt();

        // find the Largest number

        if(a>=b && a>=c){
            System.out.println("Largest number is: "+ a);
        }else if(b>=a && b>=c ){
            System.out.println("Largest number is: "+ b);
        }else{
            System.out.println("Largest number is: "+ c);
        }

        sc.close();

        }

    }

    
    /*
    Java Notes – Find the Largest of Three Numbers
📌 What I Learned
How to take user input using the Scanner class.
How to declare and initialize variables (int a, b, c).
How to compare multiple values using comparison operators (>, >=).
How to use logical AND (&&) to combine multiple conditions.
How if, else if, and else statements control the flow of a program.
How to determine the largest value among three numbers.
Why >= is used instead of > to correctly handle equal values.
How to display output using System.out.println().
The importance of closing the Scanner object with sc.close().
🛠️ Use of This Program
Finding the highest marks among three students.
Comparing salaries of three employees.
Determining the highest product price.
Finding the maximum sensor reading in IoT applications.
Comparing three bids, scores, or measurements.
Building the foundation for solving more complex comparison problems.
❓ Why Is It Necessary?
Comparison is one of the most common operations in programming.
Decision-making is essential in almost every software application.
Helps understand how programs choose different execution paths.
Builds the foundation for algorithms involving maximum and minimum values.
Improves logical thinking and problem-solving skills.
🔑 Key Concepts Used
1. Scanner Class

Used to take input from the user.

Scanner sc = new Scanner(System.in);
2. Variables

Store the numbers entered by the user.

int a, b, c;
3. Comparison Operators
Operator	Meaning
>	Greater than
<	Less than
>=	Greater than or equal to
<=	Less than or equal to
==	Equal to
!=	Not equal to
4. Logical AND (&&)

Checks if both conditions are true.

Example:

a >= b && a >= c

Means:

a is greater than or equal to b
AND
a is greater than or equal to c

Only then is a the largest.

5. if Statement

Executes a block only if the condition is true.

if(condition){
    // code
}
6. else if Statement

Checks another condition if the previous one is false.

else if(condition){
    // code
}
7. else Statement

Runs when none of the previous conditions are true.

else{
    // code
}
🧠 Logic Behind the Program
Start

↓

Input a, b, c

↓

Is a >= b AND a >= c ?

Yes → Print a

No

↓

Is b >= a AND b >= c ?

Yes → Print b

No

↓

Print c

↓

End
⚠️ Common Mistakes

❌ Forgetting &&

if(a >= b a >= c)

✅ Correct

if(a >= b && a >= c)

❌ Using = instead of ==

if(a = b)

✅ Correct

if(a == b)

❌ Forgetting to import Scanner

import java.util.Scanner;

❌ Forgetting to create the Scanner object

Scanner sc = new Scanner(System.in);
💡 Interview Questions
1. Why do we use >= instead of >?

Answer: To correctly handle cases where two or more numbers are equal. Using >= ensures one of the equal largest values is selected.

2. What does && do?

Answer: It is the logical AND operator. It returns true only if both conditions are true.

3. Can this program be written using nested if statements?

Answer: Yes. The same logic can be implemented using nested if statements, though if-else if-else is usually easier to read.

4. What happens if all three numbers are equal?

Answer: The first condition (a >= b && a >= c) becomes true, so the program prints a.

5. What is the time complexity?

Answer: O(1) (Constant Time), because the program performs a fixed number of comparisons regardless of the input values.

📖 One-Point Revision
Scanner → Takes input from the user.
int → Stores integer values.
>= → Checks "greater than or equal to."
&& → Both conditions must be true.
if → Executes code if the condition is true.
else if → Checks the next condition.
else → Executes when all previous conditions are false.
Comparison operators (>, <, >=, <=, ==, !=) are used for decision-making.
Logic: Compare a, then b, otherwise c is the largest.
Time Complexity: O(1).
This is one of the most fundamental programs for learning decision-making in Java and is frequently asked in beginner programming interviews and practical exams.
    */