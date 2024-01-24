import java.util.Scanner;
public class Countvowels {
    public static void main(String args[]){        // create scanner object
        Scanner Scanner = new Scanner(System.in);

// input part
        System.out.println("Enter The Word");
        String Word = Scanner.nextLine();

        int len = Word.length();
        int count = 0;

// loop part        // logic
        for ( int i=0; i<len; i++ ){
        char currentchar = Word.charAt(i);
// vowels define part
        if (currentchar == 'a' || currentchar == 'e' || currentchar == 'i' || currentchar == 'o' || currentchar == 'u' ){
            count++;
          }
        }
        System.out.println("Number of Vowels in the word =" + count );
    }
}
