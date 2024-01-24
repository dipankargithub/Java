package Searching;

public class Binary_Searching {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50,60,70,80,90,100};
        int n = 20;
        int s=0,e= a.length-1,mid,pass;
        while(s<=e);
        mid=(s+e)/2;
        if (n == a[mid])
        {
            pass=mid;

        }
        else if (n<a[mid])
        {
         e=mid-1;
        }
        else s = mid +1;
int result = 20;

        if (result==-1)
            System.out.println("Number is not found ");
        else
        System.out.println("Number is found"+ result);
    }
}
