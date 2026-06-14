
import java.util.*;
public class TwoDArray {
    public static void main(String args[]) {
        
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int cols = sc.nextInt();

        System.out.print("Enter the values: ");
        int[][] numbers = new int[rows][cols];

        //input 
        // rows
        for(int i=0; i<rows; i++){
            // columns
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
        }
    }

    // output
    // rows
    for(int i=0; i<rows; i++){
        // cols
        for(int j=0; j<cols; j++){
            System.out.print(numbers[i][j]+ " ");
        }
        System.out.println();
    }
}
}
