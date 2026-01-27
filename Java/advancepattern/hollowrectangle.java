import java.util.*;
public class hollowrectangle {
    public static void HollowRectangle(int a,int b){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                if(i==1|| j==1 || i==a || j==b){
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
        System.out.println("Enter your first number:");
        int a=sc.nextInt();
        System.out.println("Enter your second number:");
        int b=sc.nextInt();
        HollowRectangle(a,b);
    }
}
