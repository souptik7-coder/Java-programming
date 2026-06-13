import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first operand : ");
        int a = sc.nextInt();

        System.out.println("Enter the second operand : ");
        int b = sc.nextInt();

        System.out.println("Enter the operator : ");
        int op = sc.next().charAt(0);

        switch(op) {
            case '+' :
                System.out.println( "The sum is : " + (a + b) );
                    break;
            
            case '-' :
                System.out.println( "The sub is :" + (a - b) );
                break;
            
            case '*' :
                System.out.println( "The multiplication is :" + (a * b) );
                break;

            case '/' :
                System.out.println( "The divison is :" + (a / b) );
                break;

            case '%' :
                System.out.println( "The modulo is :" +  (a % b) );
                break;

            default :
            System.out.println( "error");

        }

    }
}
