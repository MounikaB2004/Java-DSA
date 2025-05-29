import java.util.*;
public class CharFreqCount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
        }
        for(Character key:map.keySet()){
            System.out.println(key+" -> "+map.get(key));
        }
    }
}

/*
hello world
r -> 1
d -> 1
e -> 1
w -> 1
h -> 1
l -> 3
o -> 2
*/