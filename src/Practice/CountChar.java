public class CountChar {
    public static void main(String [] args){
        String s1="cloud computing means storing and accessing , the data and programs on remote servers . That are hosted on the internet instead of the computer’s hard drive or local server. Cloud computing is also referred to as Internet-based computing ! ";
        int Count = 0;
        for (int i= 0 ; i< s1.length() ; i++ )
        {
            if(s1.charAt(i) != ' ');
            {
                Count++;
            }
        }
        System.out.println("Total Character:" +  Count );
    }
}
