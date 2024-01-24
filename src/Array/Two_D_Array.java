package Array;

public class Two_D_Array{
        public static void main(String [] args){
            int [] [] a = {{1,2,1},{3,4,3,},{5,6,5}};
            for (int i = 0 ; i < a.length ; i++){
                for(int j = 0 ; j < a.length ; j++){
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
        }
    }
