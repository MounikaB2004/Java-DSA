import java.util.*;
public class TripletSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Arrays.sort(a);
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=a[i]+a[left]+a[right];
                if(sum==target){
                    System.out.print("Triplet: "+a[i]+" , "+a[left]+" , "+a[right]);
                    return;
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        System.out.print("Not found");
    }
}
/*
6
2 3 8 9 0 1
13
Triplet: 1 , 3 , 9
*/
