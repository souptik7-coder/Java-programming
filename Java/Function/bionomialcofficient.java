//bionomial cofficient code
import java.util.*;
public class bionomialcofficient{
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int bionomial(int n,int r){
        int nfact=factorial(n);
        int rfact=factorial(r);
        int nrfact=factorial(n-r);
        int ans = nfact/(rfact*nrfact);
        return ans;
    } 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number n:");
        int n=sc.nextInt();
        System.out.println("Enter your number r:");
        int r=sc.nextInt();
        System.out.println("bionomial cofficient:"+bionomial(n,r));
    }
}