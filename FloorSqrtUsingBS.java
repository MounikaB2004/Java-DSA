import java.util.*;
public class FloorSqrtUsingBS {
    public static int floorSqrt(int n){
        int low=0;
        int high=n;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            long sq=(long) mid*mid;
            if(sq==n) return mid;
            if(sq<n){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=floorSqrt(n);
        System.out.print("Square root of "+ n +" is " +"(floor value): "+ res);
    }
}
/*
37
Square root of 37 is (floor value): 6
*/