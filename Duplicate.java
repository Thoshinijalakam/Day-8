import java.util.*;
public class Duplicate {
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
        System.out.print("code for Duplicate values");
        for(int i=0;i<max+1;i++)
        {
            if(c[i]>1)
            System.out.println(i+" ");
        }

    }
    
}
/* code for Duplicate values0 
1
5
6
7 */