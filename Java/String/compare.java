import java.util.*;
public class compare {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1="Campus Hub";
        String str2="Campus Hub";
        String str3=new String("Campus Hub");
        if(str1==str2){
            System.out.println("The strings are equal");
        }else{
            System.out.println("The strings are not equal");
        }

        if(str1==str3){
            System.out.println("The strings are equal");
        }else{
            System.out.println("The strings are not equal");      // this time the output is The strings are not equal
        }


        if(str1.equals(str3)){
            System.out.println("The strings are equal");    // It's a special function . So the output is The strings are equal
        }else{
            System.out.println("The strings are not equal");    
        }
    }
}
