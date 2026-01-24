import java.util.*;
public class ternaryoperator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int number=sc.nextInt();
        String type=((number%2==0))?"even":"odd";
        System.err.println(type);
    }
}
