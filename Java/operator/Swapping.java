import java.util.Scanner;

public class Swapping {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your number a :");
        int a = sc.nextInt();
        System.out.println("Enter your number b :");
        int b = sc.nextInt();
        int c;


// using third variable 

        c = a;
        a = b;
        b = c;


        System.out.println("a = " + a );
        System.out.println("b = " + b );

        // swapping without third variable

        System.out.println(" Enter your number x : ");
        int x = sc.nextInt(); // 4
        System.out.println("Enter your number y : ");
        int y = sc.nextInt(); //5

       x = x + y;  // 9
        y = x - y; // 4
        x = x - y; // 5

        System.out.println("x = " + x);
        System.out.println( "y = " + y);
    }
}
