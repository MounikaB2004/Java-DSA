import java.util.*;
public class HappyNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isHappy(n)){
            System.out.print(n+" is Happy number");
        }else{
            System.out.print(n+" is not Happy number");
        }
    }
    static boolean isHappy(int n){
        Set<Integer>seen=new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=sumOfSquares(n);
        }
        return n==1;
    }
    static int sumOfSquares(int num){
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+digit*digit;
            num=num/10;
        }
        return sum;
    }
}
/*
input1:
19
19 is Happy number

input2:
20
20 is not Happy number
*/