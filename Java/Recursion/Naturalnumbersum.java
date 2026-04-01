import java.util.*;
public class Naturalnumbersum {
    
    public static int NaturalSum(int n){
        if(n==1){
            return 1;
        }
        int naturalsum=NaturalSum(n-1);
        int sum=naturalsum+n;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=10;
        System.out.println("The total sum is :"+NaturalSum(n));
    }
}
