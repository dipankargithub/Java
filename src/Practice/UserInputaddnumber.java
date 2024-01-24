import java.util.Scanner;
public class UserInputaddnumber {
    public static void main(String []args){
        Scanner Scanner = new Scanner(System.in);
        //First number
        System.out.println("Enter the First number");
        int First_number = Scanner.nextInt();
        //Second number
        System.out.println("Enter the Second number");
        int Second_number= Scanner.nextInt();
        //Add two number
        int Addition = First_number + Second_number;
        System.out.println( First_number + "+" + Second_number + "=" + Addition );
    }
}
