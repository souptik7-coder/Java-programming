import java.util.*;
public class logical {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=5;
        int b=10;
        System.out.println((a>b)&&(a<b)); // false
        System.out.println((a>b)||(a<b)); // true
        System.err.println(a!=b);  // true
    }
}
