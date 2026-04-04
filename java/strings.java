/* 
import java.util.*;

public class strings {


    public static void main(String arg[]){
         //concatenation
        String  firstName = "Tony";
        String  lastName = "Stark";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.length());

        //CharAt
        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));

        }
    }
}
*/

/* 
import java.util.*;

public class strings {
    
    public static void main(String args[]){

    //compare
    String name1 = "Tony";
    String name2 = "Tony";

    // case1: s1 > s2 : +ve Value
    // case2: s1 == s2 : 0
    // case3: s1 < s2 : -ve value

// if(name1.compareTo(name2) == 0) {    // allways valid for comparing strings
//     System.out.println("Strings are equal");
// }
// else {
//     System.out.println("Strings are not equal");
// }


// if(name1 == name2) {   // == is not always valid for comparing strings
//     System.out.println("Strings are equal");
// }
// else {
//     System.out.println("Strings are not equal");
// }

// }
*/

import java.util.*;

public class strings {

    public static void main(String args[]) {

        //Compare
        String sentence = "TonyStark";
       // String name = sentence.substring(0,4);
       String  name = sentence.substring(4);

        System.out.println(name);

    }
}
