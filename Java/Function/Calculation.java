// using parameter
import java.util.*;
public class Calculation{
    public static int Sum(int a,int b){
            int sum=a+b;
            return sum;
    }
    public static int Sub(int a,int b){
            int sub=a-b;
            return sub;
}
    public static int mul(int a,int b){
            int mul=a*b;
            return mul; 
    }
    public static int div(int a,int b){
            int div=a/b;
            return div; 
    }
    public static int modulo(int a,int b){
            int modulo=a%b;
            return modulo;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number:");
        int a=sc.nextInt();
        System.out.print("Enter your second numner:");
        int b=sc.nextInt();
        System.out.println("The sum is :"+Sum(a,b));
        System.out.println("The sub is :"+Sub(a,b));
        System.out.println("The mul is :"+mul(a,b));
        System.out.println("The divison is :"+div(a,b));
        System.out.println("The modulo is :"+modulo(a,b));
    }
}
