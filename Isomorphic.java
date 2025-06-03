import java.util.*;
public class Isomorphic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        HashMap<Character,Character>map1=new HashMap<>();
        HashMap<Character,Character>map2=new HashMap<>();
        if(s1.length()!=s2.length()){
            System.out.print("Not isomorphic");
            return;
        }
        for(int i=0;i<s1.length();i++){
            if(map1.containsKey(s1.charAt(i))){
                if(map1.get(s1.charAt(i))!=s2.charAt(i)){
                    System.out.print("Not isomorphic");
                    return;
                }
            }else{
                map1.put(s1.charAt(i),s2.charAt(i));
            }
            if(map2.containsKey(s2.charAt(i))){
                if(map2.get(s2.charAt(i))!=s1.charAt(i)){
                    System.out.print("Not isomorphic");
                    return;
                }
            }else{
                map2.put(s2.charAt(i),s1.charAt(i));
            }
        }
        System.out.print("yes,Isomorphic");
    }
}
/*
door
feet
yes,Isomorphic
*/
