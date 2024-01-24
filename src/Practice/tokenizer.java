import java.util.StringTokenizer;

class StringTokenizerTest {

    public static void main(String[] args) {

        /*String s = "Hello     w    world2  World";
        StringTokenizer st1 = new StringTokenizer(s,"w");


        while (st1.hasMoreTokens()) {// Getting next tokens
            System.out.print(st1.nextToken()+ "-------");
        }*/

        String s2 = "2+3-1     *8/4";
        StringTokenizer st2 = new StringTokenizer(s2,"+*-/ ");

        while (st2.hasMoreTokens()) {// Getting next tokens
            System.out.println(st2.nextToken());
        }
        System.out.println("  \" ");
    }

}


