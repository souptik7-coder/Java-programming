// reverse the given number
import java.util.*;
public class reversenumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int reverse=0;
        System.out.print("Enter your number:");
        int n=sc.nextInt();
        while(n>0){
            int lastdigit=n%10;
            reverse=(reverse*10)+lastdigit;
            n=n/10;
        }
        System.out.print("The reverse number is :"+reverse);
    }
}