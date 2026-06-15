import java.util.*;
public class factorial {
    public static long FactorialNumber(int n){
        long fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int n=sc.nextInt();

        // upto 20 
        System.out.println("The factorial is :"+FactorialNumber(n));
    }
}
