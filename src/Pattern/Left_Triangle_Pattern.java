package Pattern;

public class Left_Triangle_Pattern {
    public static void main(String [] args) {
        // Left Triangle Star Pattern

        int i, j, row = 10;       //i row , j = cloumn
        //outer loop for rows
        for (i = 0; i < row; i++) {

            //inner loop work for space
            for (j=2*(row-i); j >= 0; j--) {
                       System.out.print(" ");
        }

            //inner loop  star  for columns
           for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
