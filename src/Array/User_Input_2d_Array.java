package Array;

import java.util.Scanner;

public class User_Input_2d_Array {
    public static void main(String []args){
        Scanner Scanner = new Scanner(System.in);

        //enter number of rows
        System.out.println("Enter number of rows :");
        int row = Scanner.nextInt();

        //enter number of cloumn
        System.out.println("Enter number of cloumn :");
        int cloumn = Scanner.nextInt();

        int a [][] = new int[row][cloumn];

        for(int i = 0 ; i<row ; i++){
            for (int j = 0; j <cloumn ; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}