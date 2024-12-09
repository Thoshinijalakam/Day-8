import java.util.*;
 public class Twotranspose{
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
        System.out.println("After transpose");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
    }

}  
}
/*   3 3
1
2
3
4
5
6
7
8
9
After transpose
1 4 7
2 5 8
3 6 9 */