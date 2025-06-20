import java.util.*;
public class SimplifyPath {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String path=sc.nextLine();
        String str[]=path.split("/");
        Stack<String>stack=new Stack<>();
        for(int i=0;i<str.length;i++){
            if(str[i].equals("")||str[i].equals(".")){
                continue;
            }else if(str[i].equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(str[i]);
            }
        }
        String result="/"+String.join("/",stack);
        System.out.print(result);
    }
}
/*

/a/./b/../../c/
/c

*/
