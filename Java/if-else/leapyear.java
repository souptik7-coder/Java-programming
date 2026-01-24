import java.util.*;
public class leapyear {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year:");
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("The year is leap year");
        }else if(year%100!=0){
            System.out.println("The year is not leap");
        }else if(year%400==0){
            System.out.println("The year is leap year");
        }
    }
}
