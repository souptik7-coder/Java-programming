import java.util.*;
public class decreasingnumber {

    public static void DecreasingNumber(int n){
        if(n==1){
            System.out.println(n);
            return ;

        }
        System.out.println(n);
        DecreasingNumber(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=10;
        DecreasingNumber(n);
    }
}
