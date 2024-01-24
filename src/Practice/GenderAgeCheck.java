package Practice;
import java.util.Scanner;

public class GenderAgeCheck {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // scanner object

//1st input
        System.out.println("Enter Your Gender");
        String gender = scanner.nextLine();

// 2nd input
        System.out.println("Enter Your Age");
        int age = scanner.nextInt();

//logic
        if (gender.equalsIgnoreCase("M")){
            if (age >= 21){
                System.out.println("Eligible");
            }else{
                System.out.println("NOT Eligible");
            }
        }else{
            if(age>=18){
                System.out.println("Eligible");
            }else{
                System.out.println("NOT Eligible");
            }
        }
    }
}
