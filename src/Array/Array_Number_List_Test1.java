package Array;

import java.util.ArrayList;
import java.util.List;

public class Array_Number_List_Test1 {

        public static void main(String[] args) {

            List<Integer> numList = new ArrayList<Integer>();  // ArrayList Object

            List numList1 = new ArrayList();

            numList1.add("Hi ");
            numList1.add(2);
            //numList1.add("hi  2 ")
            System.out.println("Can You Say " + numList1);

            boolean status = numList.add(1); //index 0      //(boolean is a primitive data and it also wra )
            numList.add(2);   //index 1
            numList.add(4);  //index 2
            // [1    2     4]
            System.out.println("Before--" + numList);

            numList.add(2, 3);        //input data or number with the help of index number
            //[ 1   2   3  4]
            System.out.println("inserting at random index ----- " + numList);

            numList.add(4, 100);
            //[ 1   2   3  4  100]
            System.out.println("After--" + numList);

            //size of numberlist
            System.out.println("Size of numlist " + numList.size());

            //boolean
            System.out.println(status);
        }
    }

