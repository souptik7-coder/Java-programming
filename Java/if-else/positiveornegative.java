import java.util.*;
public class positiveornegative {
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your number:");
    int number=sc.nextInt();
    if(number>0){
        System.out.println("The number is positive");
    }else if(number<0){
        System.out.println("The number is negative");
    }else{
        System.out.println("The number is 0");
    }
 }   
}