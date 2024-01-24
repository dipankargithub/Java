import java.util.StringTokenizer;
public class StringAssigment {
    public static void main(String[] args) {
        String S1 = "On July 16,1969,the Apollo 11 spacecraft" +
                "launched from the Kennedy Space Center in Florida." +
                "Its mission was to go where no human being had gone" +
                "before—the moon!The crew consisted of " +
                "Neil Armstrong,Michael Collins,and Buzz Aldrin." +
                "The spacecraft landed on the moon in the Sea of Tranquility,"+
                "a basaltic flood plain,on July 20, 1969.";
           // adding String to the paragraph
           String a = (S1.replaceAll("," ,", "));
           String b = (a.replaceAll("! " , "! "));
           String c = (b.replaceAll("\\." , ". "));
           System.out.println("printing output after inserting space -- \n" + c);
        }
    }

