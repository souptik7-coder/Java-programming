import java.util.*;
public class fibonacciseriesnumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=10;
        for(int i=0;i<n;i++){
            int next=a+b;
            System.out.println(next);
            a=b;
            b=next;
        }
    }
}
