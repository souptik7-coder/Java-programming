import java.util.*;
public class Amstrongnum {
    public static boolean AmstrongNumber(int n){
        int original=n;
        int sum=0;
        int digit=String.valueOf(n).length();
        while(n>0){
            int lastdigit=n%10;
            sum=sum+(int)Math.pow(lastdigit,digit);
            n=n/10;
        }
        if(sum==original){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=153;
        boolean ams=AmstrongNumber(n);
        if(ams==true){
            System.out.println("The given number is Amstrong");
        }else{
            System.out.println("The given number is not Amstrong");
        }
    }
}
