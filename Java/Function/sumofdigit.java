import java.util.*;
public class sumofdigit {

    public static int SumOfDigit(int num){
        int sum=0;
        while(num>0){
            int lastdigit=num%10;
            sum=sum+lastdigit;
            num=num/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int num=sc.nextInt();
        System.out.println("The sum of the digit is :"+SumOfDigit(num));
    }
}
