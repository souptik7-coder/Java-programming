// multiplication table
import java.util.*;
public class multiplicatuiontable {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int n=sc.nextInt();
        for(int i=n;i<=n*10;i=i+n){
            System.out.println(i);
        }
    }
}
