// prime number
import java.util.*;
public class primenumner{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int n=sc.nextInt();
        boolean isprime=true;
        if(n==2){
            System.out.println("The number is prime");
        }else{
            for(int i=2;i<n-1;i++){
                if(n%i==0){
                    isprime=false;
                }
            }
        }
        if(isprime==true){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }
    }
}
