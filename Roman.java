import java.util.*;
public class Roman {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String sym[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman=new StringBuilder();
        for(int i=0;i<val.length;i++){
            while(n>=val[i]){
                roman.append(sym[i]);
                n=n-val[i];
            }
        }
        System.out.print(roman.toString());
    }
}
/*
1994
MCMXCIV
*/