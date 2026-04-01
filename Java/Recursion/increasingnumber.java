import java.util.*;
public class increasingnumber {
    public static void IncreasingNumber(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        IncreasingNumber(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=10;
        IncreasingNumber(n);
    }
}
