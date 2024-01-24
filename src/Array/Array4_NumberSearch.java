package Array;

public class Array4_NumberSearch {
    public static void main(String [] args){
        int [] array1 ={ 0, 10 ,20,30,40,50,60,70,80,90};   // Array object

        // variable define
        int num =10;
        int result =20 ;

        for(int i =0; i< array1.length; i++) {
            System.out.println(array1[i]);
        }
       if(result ==100) {
          System.out.println("NUMBER FOUND");
        }
       else {
            System.out.println("NUMBER NOT FOUND");
        }
    }
}