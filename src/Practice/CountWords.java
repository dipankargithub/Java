public class CountWords {
        public static void main(String [] args){
            String s1="cloud computing means storing and accessing , the data and programs on remote servers . That are hosted on the internet instead of the computer’s hard drive or local server. Cloud computing is also referred to as Internet-based computing ! ";
            int Count = 0;
            for (int i= 0 ; i< s1.length() - 1 ; i++ )
            {
                if((s1.charAt(i) == ' ') && (s1.charAt(i+1) != ' '))
                {
                    Count++;
                }
            }
            System.out.println(" Total Words: " +  Count );
        }
    }
