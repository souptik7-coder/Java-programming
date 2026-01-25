// display all numbers entered except multiple of 10
import java.util.*;
public class displayallnumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(;;){
            System.out.print("Enter your number:");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("The number is :"+n);
        }
    }
}