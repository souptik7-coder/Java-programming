import java.util.*;
public class reverseanumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int n=sc.nextInt();
        while(n>0){
            int lastdigit=n%10;
            System.err.print(lastdigit+" ");
            n=n/10;
        }
    }
}
