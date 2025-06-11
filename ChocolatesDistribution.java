import java.util.*;
public class ChocolatesDistribution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        if(m==0||n==0||m>n){
            System.out.print("Invalid input");
            return;
        }
        Arrays.sort(a);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<n-m+1;i++){
            int diff=a[i+m-1]-a[i];
            if(diff<minDiff){
                minDiff=diff;
            }
        }
        System.out.print(minDiff);
    }
}
/*
7
12 9 10 7 6 32 11
3
2
*/
