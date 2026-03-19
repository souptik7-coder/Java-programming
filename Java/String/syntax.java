import java.util.*;
public class syntax {


    public static void PrintName(String fullname){
        for(int i=0;i<fullname.length();i++){
            System.out.print(fullname.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char ch[]={'a','b','c','d'};
        System.out.println(ch);
        String arr=new String("xyz");
        System.out.println(arr);
        // String giveinp=sc.nextLine();
        // System.out.println(giveinp);
        String firstname="Campus";
        String lastname="Hub";
        String fullname=firstname+" "+lastname;
        // System.out.println("The fullname is :"+fullname);
        PrintName(fullname);
    }
}
