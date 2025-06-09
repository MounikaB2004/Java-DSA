import java.util.*;
public class RotateArraybyk{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        reverse(a,0,n-1);
        reverse(a,0,k-1);
        reverse(a,k,n-1);
        for(int val: a) System.out.print(val+" ");
    }
    public static void reverse(int a[], int left, int right){
        while(left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }
}
/*
7
1 2 3 4 5 6 7
3
5 6 7 1 2 3 4 
*/