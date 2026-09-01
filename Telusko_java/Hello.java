public class Hello {
    public static void main(String args[])
    {

        // type_of_variable variable_name = value;   
        // this is the way of assigning value  in variable.

    // int num1 = 3;
    // int num2 = 4;
    // int sum = num1 + num2;

    // System.out.println("Result is : " + sum);
    // System.out.print("Hello world..Its Roushan Mishra.");

    // different types of datatype
    // int num = 9;
    // byte by = 127;
    // short sh = 558;
    // long l = 58543l;

    // float f = 5.8f;
    // double d = 5.8;

    // char c = 'k';
    // boolean b = true;


    // literals
    int num3 = 0b101; //we can also print hexadecimal no. like : 0x7E
    System.out.println(num3);
    int num4 = 10_00_00_000; //this method helps you count no. of zeros
    System.out.println(num4); // but in result you will get normal value.
    // we can run this, this will not give any result bcz we are not printing anything.

        // byte b = 127; direct conversion of byte to int is possible if it is in range.
        // but int  to  byte in not possible, so we do "TypeCasting"

        // int a = 12; it was in byte range thats why it gave us 12 as return value.
        // but if it is not in range of byte then it give us modulus value, in simple terms value after dividing it.
        // int a = 257;
        // byte k = (byte) a; 

        float f = 5.6f;
        int t = (int) f; //typecasting
        System.out.println(t);

        byte a = 10;
        byte b = 30;
        int result = a * b;
        System.out.println(result); // so we got output : 1

}
}

//In this we have done, variables, data type, type Casting.