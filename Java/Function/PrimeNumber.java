import java.util.*;
public class PrimeNumber {

    public static boolean primeNumber(int n){

        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }else{
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
    }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean isprime=primeNumber(11);
        if(isprime==true){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }
    }
}
