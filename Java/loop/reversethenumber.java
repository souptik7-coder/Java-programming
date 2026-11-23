// reverse the given number
import java.util.*;
public class reversethenumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your number :");

        int n = sc.nextInt();

        int reverse = 0;

        // reverse = ( reverse * 10 ) + lastdigit

        while( n > 0) {

            int lastdigit = n % 10;

            reverse = ( reverse * 10 ) + lastdigit;

            n = n / 10;
        }

        System.out.println("The reverse number is : " + reverse);
    }
}