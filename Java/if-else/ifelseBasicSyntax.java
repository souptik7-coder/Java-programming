import java.util.*;
public class ifelseBasicSyntax{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number A: ");
        int a=sc.nextInt();
        System.out.print("Enter your number B: ");
        int b=sc.nextInt();
        if(a>b){
            System.out.print("A is larger");
        }else{
            System.out.print("B is larger");
        }
    }
}