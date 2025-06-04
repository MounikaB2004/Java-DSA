import java.util.*;
public class Target{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        sc.close();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int complement=target-a[i];
            if(map.containsKey(complement)){
                System.out.print(map.get(complement)+" "+i);
                return;
            }
            map.put(a[i],i);
        }
        System.out.print("Not found");
    }
}
/*
5
4 3 0 8 1
11
1 3
*/