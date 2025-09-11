import java.util.*;
public class PeakElementArray {
    public static int peakElement(int a[]){
        int low=0;
        int high=a.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(a[mid]<a[mid+1]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int res=peakElement(a);
        System.out.print("Peak element position: "+res);
    }
}
/*
4
1 2 3 1
Peak element position: 2
*/