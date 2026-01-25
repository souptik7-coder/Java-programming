import java.util.*;
public class averageofthereenumber {
    public static float Average(float a,float b,float c){
            float average=(a+b+c)/3;
            return average;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the a:");
        float a=sc.nextFloat();
        System.out.print("Enter the b:");
        float b=sc.nextFloat();
        System.out.print("Enter the c:");
        float c=sc.nextFloat();
        System.out.println("The average is:"+Average(a,b,c));
    }
}
