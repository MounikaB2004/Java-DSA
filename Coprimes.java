import java.util.*;
public class Coprimes {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        System.out.println("The co-primes pairs: ");
        for(int a=2;a<Math.sqrt(n);a++){
            if(n%a==0){
                int b=n/a;
                if(a<b && gcd(a,b)==1){
                    System.out.println("(" + a+"," + b +")");
                    count++;
                }
            }
        }
        System.out.println("Number of paris: "+count);
    }
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
/*
input1:

250
The co-primes pairs: 
(2,125)
Number of paris: 1


input2:
246
The co-primes pairs: 
(2,123)
(3,82)
(6,41)
Number of paris: 3
*/
