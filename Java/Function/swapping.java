import java.util.*;
public class swapping {
    public static void swap(int a,int b){
        int c=a;
        a=b;
        b=c;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number a:");
        int a=sc.nextInt();
        System.out.println("Enter the second number b:");
        int b=sc.nextInt();
        swap(a,b);
    }
}
