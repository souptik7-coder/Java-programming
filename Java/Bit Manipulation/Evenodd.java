import java.util.*;
public class Evenodd {

    public static boolean Evenodd(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int n=sc.nextInt();
        boolean evenodd=Evenodd(n);
        if(evenodd==true){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
