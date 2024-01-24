import java.util.Scanner;

public class AddUserInput {

        public static void main(String[] args) {
            Scanner Sanner = new Scanner(System.in);   // scanner object
//1st input
            System.out.println("ENTER A :");
            int A = Sanner.nextInt();
//2nd input
            System.out.println("ENTER B :");
            int B = Sanner.nextInt();

//logic
            int add = A + B;

            System.out.println( A + "+" + B + "=" + add);
        }
    }

