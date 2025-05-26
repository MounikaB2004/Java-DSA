import java.util.*;
public class SecondMax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int fm=Integer.MIN_VALUE;
        int sm=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>fm){
                sm=fm;
                fm=a[i];
            }else if(a[i]>sm && a[i]!=fm){
                sm=a[i];
            }
        }
        if(sm==Integer.MIN_VALUE){
            System.out.print("No sec Max element");
        }else{
            System.out.print(sm);
        }
    }
}
