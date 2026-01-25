// keep entering numbers till user enters a multiple ogf 10
import java.util.*;
public class keepenteringnumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(;;){
            System.err.println("Enter your number:");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
        }
        System.err.println("I am out of the loop");
    }
}