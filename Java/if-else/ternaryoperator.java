// ternary operator

import java.util.*;
public class ternaryoperator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter your number :");
        int number = sc.nextInt();

        String type = ((number % 2) == 0) ? "The number is even" : "The number is odd";

        System.out.println(type);

    }
}
