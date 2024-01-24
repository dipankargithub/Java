package Pattern;
import java.util.Scanner;
public class User_Input_Pyramid_Pattern {
public static void main(String [] args){
    Scanner Scanner = new Scanner (System.in);

    //user input
    System.out.println("Enter the total number of ROW : ");
    int ROW = Scanner.nextInt();

    //i is call row and j is call cloumn
    int i , j;

    //outer loop
    for(i = 0 ; i< ROW ;i++){

        //inner loop for space
        for(j = ROW-i ; j>1 ;j--){
            System.out.print(" ");
        }

        //inner loop for star
        for (j=0 ; j<=i;j++){
            System.out.print("* ");
        }
        //for space
        System.out.println();
    }
}
}
