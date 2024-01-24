import java.util.Scanner;

public class table_WIth_loop {
    public static void main(String [] args){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter The NUmber : ");
        int n = Scanner.nextInt();

        for ( int  i = 1 ; i < 11; i++ ){

            System.out.println( n + "*" +  i  + "=" +  n*i );
        }
    }
}
