package Pattern;
public class Right_Triangle_Pattern {
        public static void main (String []args){

            // Right Triangle Star Pattern

            int i  , j , row = 8 ;    //i is row , j is cloumn

            //outer loop for rows
            for (i =0 ; i < row ; i++){

                //inner loop for columns
                for (j =0 ; j <= i; j++){
                    System.out.print(" * ");  // type to print
                }

                //throws the cursor in a new line after printing each line
                System.out.println();
            }
        }
    }

