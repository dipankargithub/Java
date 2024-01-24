import java.util.Scanner;
public class hackerrank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //scanner object
//array length input
        System.out.println("ENTER YOUR ARRAY LENGTH :-");
        int numbers = sc.nextInt();
//array object
        int [] array = new int[numbers];
//array position and array number useinput
        for ( int i=0; i<numbers ; i++ )
        {
            System.out.println( "enter " + i + "position number..");
            array[i] = sc.nextInt();
        }
//array print
        System.out.println("Your array number is ....");
        for(int i=0; i < array.length; i++)
        {
            System.out.println(array[i]  );
        }
    }
}
