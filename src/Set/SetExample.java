package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class SetExample {
    public static void main (String[] args) {

        // ARRAY LIST EXAMPLE
        List<Integer> NumberSet1 = new ArrayList<>();

        NumberSet1.add(1);
        NumberSet1.add(2);
        NumberSet1.add(3);
        NumberSet1.add(3);
        NumberSet1.add(4);

        System.out.println("THE NUMBERS ARE : " + NumberSet1);

        // HASE SET EXAMPLE

        HashSet<Integer> NumberSet2 = new HashSet<>();

        NumberSet2.add(1);
        NumberSet2.add(2);
        NumberSet2.add(3);
        NumberSet2.add(3);
        NumberSet2.add(4);

        System.out.println("THE NUMEBERS ARE : " + NumberSet2);
    }
}