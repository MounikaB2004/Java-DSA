import java.util.*;
public class SearchIn2DMatrix {
    public static boolean search(int matrix[][],int target){
        int m=matrix.length;
        int n=matrix[0].length;
        int low=0;
        int high=m*n-1;
        while(low<=high){
            int mid=(low+high)/2;
            int rows=mid/n;
            int cols=mid%n;
            if(matrix[rows][cols]==target) return true;
            else if(matrix[rows][cols]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int matrix[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        boolean res=search(matrix,target);
        System.out.print(res);
    }
}
/*
3
3      
1 2 3 4 5 6 7 8 9
8
true
*/