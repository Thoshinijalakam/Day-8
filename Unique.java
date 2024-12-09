import java.util.*;
public class Unique{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int max=arr[n-1];
        int c[]=new int[max+1];
        for(int i=0;i<n;i++)
        c[arr[i]]++;
        System.out.print("code for Unique values");
        for(int i=0;i<max+1;i++)
        {
            if(c[i]==1)
            System.out.println(i+" ");
        }

    }
    
}
/*  12
7 6 7 6 5 6 5 4 1 0 0 1
code for Unique values4 */