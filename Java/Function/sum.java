import java.util.*;
public class sum {
  
  public static void Sum(int a, int b) {

    int c = a + b;
    System.out.println("The sum is :" + c);
  }
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your number a :");
    int a = sc.nextInt();
    System.out.println("Enter your number b :");
    int b = sc.nextInt();


    Sum(a, b);
  }
}