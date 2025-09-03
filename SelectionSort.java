import java.util.*;
public class SelectionSort {
    public static void selectionSort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min_index]){
                    min_index=j;
                }
            }
            int temp=a[min_index];
            a[min_index]=a[i];
            a[i]=temp;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        selectionSort(a);
        System.out.print("Sorted array: "+Arrays.toString(a));
    }
}
/*
6
2 8 7 5 1 0
Sorted array: [0, 1, 2, 5, 7, 8]
*/
