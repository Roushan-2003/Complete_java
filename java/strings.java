
/* 
public class strings{
    public static void main(String args[]){
        //String declaration
        String name ="Tony";
        String fullname = " Tony Stark";
        String Sentence = "My name is Tony stark.";

    }
}
*/



/* 

//Taking String input from user

import java.util.*;
public class strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();  // when you want to take single work input then we use only " sc.next()" but for a complete sentence " sc.nextLine()" 
        System.out.println("Your name is: " + name );


    }
}
    */




/* 
// Concatination : adding two strings

public class strings{
    public static void main(String args[]){
        
        // concatination
        String firstName = "Supriya";
        String lastName = "Sharma";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName);

        // for the length 0f String
        
        System.out.println("The length of String is: " + fullName.length());
    
        //  .charAt = for printing every single letter of name.

        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));

        }
    }
}

*/


/* 
// for comparing strings = .compareTo 

public class strings{
    public static void main(String args[]){
        String name1 = "Supriya";
        String name2 = "Roushan";

        // 1 s1>s2 : +ve value
        // 2 s1<s2 : -ve value
        // 3 s1==s2 : equal
        
        // if(name1.compareTo(name2) == 0) {
        //     System.out.println("String are equal");
        // }else{
        //     System.out.println("Strings are not equal.");
            
        // }

        if(name1 == name2) {      // "==" function is also working correctly same as CompareTo function..", // but == function sometime fails that's why CompareTO function is more reliable.
            System.out.println("Strings are equal.");
        }else{
            System.out.println("Strings are not equal.");
        }
    }
}
*/



 
// parsing /SubString: eg. word of a sentence
public class strings{
    public static void main(String args[]){
        
        String sentence = "Roushan Mishra";
        // .substring(beginIndex, endIndex) to take word between these index only.

        String name = sentence.substring(7, sentence.length());
        String name2= sentence.substring(7); // if we dont ending index, wo khud s last string ko ending index smjh leta h
        System.out.println(name);
        System.out.println(name2);

        // Strings are immutable. why?? read about it.
        // System.out.println(name.length());

    }
}


