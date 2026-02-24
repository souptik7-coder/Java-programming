import java.util.*;
public class Fibonacciseries {
    public static void fibonacciseries(int n){
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<=n;i++){
            int next=a+b;
            System.out.println(next);
            a=b;
            b=next;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int n=sc.nextInt();
        fibonacciseries(n);
    }
}
