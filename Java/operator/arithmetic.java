import java.util.*;
public class arithmetic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=5;
        int b=10;
        System.out.println(a+b);
        System.out.println(b-a);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(b%a);
        System.out.println(a++); // first print a=5 ,then increase a=6
        System.err.println(a--); // first print a=6 , then decrease a=5;
        System.out.println(--b); // first decrease the print b=9
        System.err.println(b--); // first print b=9 then decrease b=8;
        System.err.println(b);
    }
}