import java.util.*;
public class MaxSubarraySum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=Math.max(a[i],sum+a[i]);
            max=Math.max(max,sum);
        }
        System.out.print(max);
    }
}
//Kadane's Alg
/*
8
2 -1 0 -3 5 -3 4 -1
6
*/