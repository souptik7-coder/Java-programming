// HollowRhombus pattern
import java.util.*;
public class hollowrhombus {
    public static void HollowRhombus(int n,int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your n:");
        int n=sc.nextInt();
        System.out.println("Enter your m:");
        int m=sc.nextInt();
        HollowRhombus(n,m);
    }
}