import java.util.*;
public class FirstNonRepeatingChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        } 
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                System.out.print(s.charAt(i));
                return;
            }
        }
        System.out.print(-1);
    }
}
/*
swiss
w
*/