import java.util.*;
public class substring{


    // substring
    public static String substring(int start,int end,String str){
        String substring="";
        for(int i=start;i<=end;i++){
            substring=substring+str.charAt(i);
        }
        return substring;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=new String("Campus Hub");
        System.out.println(substring(0,5,str));
    }
}