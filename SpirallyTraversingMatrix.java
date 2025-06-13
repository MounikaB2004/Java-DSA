import java.util.*;
public class SpirallyTraversingMatrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int top=0;
        int bottom=r-1;
        int left=0;
        int right=c-1;
        while(top<=bottom && left<=right){
            for(int i=top;i<=right;i++){
                System.out.print(a[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(a[i][right]+" ");
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.print(a[bottom][i]+" ");
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(a[i][left]+" ");
                }
                left++;
            }
        }
    }
}
/*
3
3
1 2 3
4 5 6
7 8 9
1 2 3 6 9 8 7 4 5 
*/