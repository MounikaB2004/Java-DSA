import java.util.*;
public class FirstLastOccurCountInBinarySearch {
    public static int firstOccur(int a[], int x){
        int low=0, high=a.length-1;
        int ans=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(a[mid]==x){
                    ans=mid;
                    high=mid-1;
                }else if(a[mid]<x){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        return ans;
    }
    public static int lastOccur(int a[], int x){
        int low=0, high=a.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==x){
                ans=mid;
                low=mid+1;
            }else if(a[mid]<x){
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
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int first=firstOccur(a,x);
        int last=lastOccur(a,x);
        if(first==-1){
            System.out.println("Target element not found");
        }else{
            System.out.println("First Occurrence of "+ x +" is: "+first);
            System.out.println("Last Occurrence of "+ x +" is: "+last);
            System.out.println("Number of occurences of "+ x +" is: "+ (last - first + 1));
        }
    }
}
/*
6
3 4 5 7 7 8
7
First Occurrence of 7 is: 3
Last Occurrence of 7 is: 4
Number of occurences of 7 is: 2
*/
