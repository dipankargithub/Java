import java.util.Scanner;
public class Minof3Number {
        public static void main(String[] args) {
            Scanner Scanner = new Scanner(System.in);        //scannerobject

//1st input
            System.out.println("ENTER A :-");
            int A = Scanner.nextInt();
//2nd input
            System.out.println("ENTER B:-");
            int B = Scanner.nextInt();
//3rd input
            System.out.println("ENTER C:-");
            int C = Scanner.nextInt();

//logic
            if (A <= B && A <= C) {
                System.out.println("THE MIN NUMBER IS :" + A);
            }
            else if (B <= A && B <= C) {
                System.out.println("THE MIN NUMBER IS :" + B);
            }
            else {
                System.out.println("THE MIN NUMBER IS :" + C);
            }
        }
}


