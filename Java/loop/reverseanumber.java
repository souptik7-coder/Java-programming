// reverse the number 

import java.util.Scanner;

public class reverseanumber {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number :");

        int n = sc.nextInt(); // 10085

        while(n > 0) {

            int lastdigit = n % 10;

            System.out.print(lastdigit);

            n = n / 10;
        }
    }
}