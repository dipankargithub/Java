
import java.util.Scanner;
public class Maxof3Number {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);   //scanner object

    // 1st input
         System.out.println("Enter A-");
         int A = Scanner.nextInt();

    // 2nd input
         System.out.println("Enter B-");
         int B = Scanner.nextInt();

    //3rd input
         System.out.println("Enter c-");
         int C = Scanner.nextInt();

    //logic
         int MAX;
         if(A > B ){
             if(A > C){
                 MAX=A;
             }else{
                 MAX=C;
             }
        }else{
             if(B > C ){
                 MAX=B;
             }else{
                 MAX=C;
             }
         }
        System.out.println(" THE MAX NUMBER IS :" + MAX );
    }
}
