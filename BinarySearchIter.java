import java.util.*;
public class BinarySearchIter {
    public static int binarySearch(int a[], int x){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(x==a[mid]){
                return mid;
            }else if(x<a[mid]){
                high=mid-1;
            }else{
                low=mid+1;
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
        int x=sc.nextInt(); //target
        int res=binarySearch(a,x);
        if(res==-1){
            System.out.print("Target not forund");
        }else{
            System.out.print("Result: "+res);
        }
    }
}
/*
5
3 78 90 93 102
102
Result: 4
*/
