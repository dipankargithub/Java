package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class Array_String_List_Test2 {
        public static void main(String[] args) {
            List<String> textList = new ArrayList<>();      // ArrayList Object

            textList.add("Anil"); //0
            textList.add("anil");  //1
            textList.add("Sunil"); //2
            textList.add("Malini"); //3
            //[Anil, Anil, Sunil, Malini]
            System.out.println("**** textList*** " + textList);

            //lexicographical sorting

            Collections.sort(textList); //default sorting
            //[Anil, Anil, Malini, Sunil]
            System.out.println("**** textList after sorting*** " + textList);

        }
    }
