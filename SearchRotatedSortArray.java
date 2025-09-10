import java.util.*;
public class SearchRotatedSortArray {
    public static int rotatedArray(int a[], int x){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==x) return mid;
            if(a[low]<=a[mid]){
                if(a[low]<=x && x<a[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(a[mid]<x && x<=a[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int res=rotatedArray(a,x);
        System.out.print(res);
    }
}
/*
6
7 8 1 2 3 4
3
4
*/

