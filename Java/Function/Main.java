import java.util.*;
public class Main{
    public static void Sum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number:");
        int a=sc.nextInt();
        System.out.print("Enter your second number:");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("The sum is :"+c);
    }
    public static void modulo(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number:");
        int a=sc.nextInt();
        System.out.print("Enter your second number:");
        int b=sc.nextInt();
        int c=a%b;
        System.out.print("The modulo is :"+c);
    }
public static void Sub(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your first number:");
    int a=sc.nextInt();
    System.out.print("Enter your second number:");
    int b=sc.nextInt();
    int c=a-b;
    System.out.println("The sub is :"+c);
}
public static void mul(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your first number:");
    int a=sc.nextInt();
    System.out.print("Enter your second number:");
    int b=sc.nextInt();
    int c=a*b;
    System.out.println("The multiplication is :"+c);
}
public static void division(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your first number:");
    int a=sc.nextInt();
    System.out.print("Enter your second number:");
    int b=sc.nextInt();
    int c=a/b;
    System.out.println("The divison is :"+c);
}
public static void main(String args[]){
    Sum();
    Sub();
    mul();
    modulo();
    division();
}
}