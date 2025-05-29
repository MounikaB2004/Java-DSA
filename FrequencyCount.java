import java.util.*;
public class FrequencyCount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for(Integer key:map.keySet()){
            System.out.println(key+" -> "+map.get(key));
        }
    }
}

/*
8
2 3 1 4 3 2 3 5
1 -> 1
2 -> 2
3 -> 3
4 -> 1
5 -> 1
*/