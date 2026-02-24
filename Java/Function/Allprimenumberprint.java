import java.util.*;
public class Allprimenumberprint {
    
    public static void allprimenumber(int n){
        for(int i=2;i<=n;i++){
            int count=0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(i);
        }
        }
    }
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int n=sc.nextInt();
        allprimenumber(n);
    }
}
