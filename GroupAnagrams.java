import java.util.*;
public class GroupAnagrams {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String a[]=new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLine();
        }
        HashMap<String,List<String>>map=new HashMap<>();
        for(String word:a){
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String sorted=new String(chars);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(word);
        }
        for(List<String>group: map.values()){
            System.out.print(group);
        }
    }
}
/*
6
ten
ate
eat
net
tab
bat
[ate, eat][tab, bat][ten, net]
*/
