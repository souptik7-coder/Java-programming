import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int a=sc.nextInt();
        System.out.print("Enter your number:");
        int b=sc.nextInt();
        System.out.print("Enter your operator:");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println("The Sum is:"+(a+b));
                break;
            case '-':
                System.out.println("The sub is :"+ (a-b));
                break;
            case '*':
                System.out.println("The multiplication is :"+(a*b));
                break;
            case '/':
                System.out.println("The division is :"+(a/b));
                break;
            case '%':
                System.out.println("The modulo is:"+(a%b));
                break;
            default:
                System.out.println("error");
        }
    }
}
