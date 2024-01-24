package Array;

import java.util.Scanner;

public class Array_Square {

    public class ArraySquare {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the length of array");
            int n = sc.nextInt();

            int[] array1 = new int[n];

            System.out.println("enter the items");

            for (int i = 0; i < n; i++) {
                array1[i] = sc.nextInt();
            }
        }
    }
}
