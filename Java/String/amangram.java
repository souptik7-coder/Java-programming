import java.util.Arrays;
import java.util.Scanner;
public class amangram {

    public static boolean Amangram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        // convert lowercase
        String a=str1.toLowerCase();
        String b=str2.toLowerCase();
        char arr1[]=a.toCharArray();
        char arr2[]=a.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1="Listen";
        String str2="Silent";
        boolean amangram=Amangram(str1, str2);
        if(amangram==true){
            System.out.println("The two strings are amangram");
        }else{
            System.out.println("The two strings are not amangram");
        }
    }
}
