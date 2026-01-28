import java.util.*;
public class ArrayCC {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // average
        float marks[]=new float[50];
        System.out.println("Enter your Physics Marks:");
        marks[1]=sc.nextInt();
        System.out.println("Enter your Chemistry Marks:");
        marks[2]=sc.nextInt();
        System.out.println("Enter your Mathematics Makrs:");
        marks[3]=sc.nextInt();
        float average=((marks[1]+marks[2]+marks[3])/3);
        System.out.println("The average marks is :"+average);
    }
}
