import java.util.*;
public class fibonaccinumber {

    public static int Fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int a=Fibonacci(n-1);
        int b=Fibonacci(n-2);
        int c=a+b;
        return c;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=10;
        System.out.println(Fibonacci(n));
    }
}
