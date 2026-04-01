import java.util.*;
public class Factorialnum {
    public static int FactorialNumber(int n){
        if(n==0){
            return 1;
        }
        int factorial=FactorialNumber(n-1);
        int fact=n*factorial;
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=5;
        System.out.println("The factorial of "+n+" is :"+FactorialNumber(n));
    }
}
