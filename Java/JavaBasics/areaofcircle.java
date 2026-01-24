import java.util.*;
public class areaofcircle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your r:");
        float r=sc.nextFloat();
        float circle=3.14f*r*r;
        System.out.print("The area of the circle is :"+circle);
    }
}
