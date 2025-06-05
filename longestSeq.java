import java.util.*;
public class longestSeq {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Set<Integer>set=new HashSet<>();
        for(int num:a){
            set.add(num);
        }
        int longest=0;
        for(int num:a){
            if(!set.contains(num-1)){ //new start
                int crntnum=num;
                int streak=1;
                while(set.contains(crntnum+1)){
                    crntnum++;
                    streak++;
                }
                longest=Math.max(longest,streak);
            }
        }
        System.out.print(longest);
    }
}
/*
7
4 56 3 88 7 6 5
5
*/
