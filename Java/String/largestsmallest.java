import java.util.*;
public class largestsmallest {

    public static String largest(String fruits[]){
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){
                largest=fruits[i];
            }
        }
        return largest;
    }

    public static String smallest(String fruits[]){
        String smallest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(smallest.compareToIgnoreCase(fruits[i])>0){
                smallest=fruits[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String fruits[]={"apple","banana","pineapple","mango"};
        System.out.println("The largest fruit is :"+largest(fruits));
        System.out.println("The smallest fruit is :"+smallest(fruits));
    }
}
