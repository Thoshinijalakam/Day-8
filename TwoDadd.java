import java.util.*;
 public class TwoDadd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int arr1[][]=new int[r][c];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
/* 3  
3
1
2
3
4
5
6
7
8
9

3
3
1
2
3
4
5
6
7
8
9
2 4 6 
8 10 12
14 16 18 */