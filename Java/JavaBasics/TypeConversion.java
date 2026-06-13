import java.util.*;
public class TypeConversion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
       
        //  Type conversion


        int a= 50;
        double b = a;

        int c = 40;
        float d = c;
        System.out.println(b);
        System.out.println(d);


        // Type Casting

        float a1 = 25.12f;
        int b1 = (int)a1;


        float c1 = 2.5f;
        int d1 = (int)c1;

            System.out.println(b1);

            System.out.println(d1);

        
         // Type promotion
         
         char a2 = 'a';
         char b2 = 'b';
         System.out.println((int)a2);
         System.out.println((int)b2);
        System.out.println(b2 - a2);


        int y1 = 21;
        double y2 = 52.25;
        float y3 = 5.4f;
        long y4 = 55;
        double y5 = ( y1 + y2 + y3 + y4 );
        System.out.println(y5);


        byte k1 = 5;
        byte k2 = (byte)(k1*2);
        System.out.println(k2);


        short r1 = 5;
        short r2 = 10;
        short r3 = (short)(r1 * r2);
        System.out.println(r3);



        float o1 = 5.4f;
        float o2 = 5.9f;
        float o3 = o1 * o2;
        System.out.println(o3);
    }
}