// write a program that reads a set of integers, and then prints the sum of the even and odd integers
import java.util.*;
public class sumofoddandevennumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter some numbers:");
        int n=sc.nextInt();
        int even=0;
        int odd=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                even=even+i;
            }else{
                odd=odd+i;
            }
        }
        System.out.println("The even numbers are:"+even);
        System.out.print("The odd numbers are :"+odd);
    }
}