import java.util.*;
public class stringbuilder {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println("The total length is :"+sb.length());
        Integer a=10;
        System.out.println(a.toString());
        Character ch='a';
        System.out.println(ch.toString());
    }
}
