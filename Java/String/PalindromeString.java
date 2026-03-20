import java.util.*;
public class PalindromeString {
    public static boolean Palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str="noon";
        boolean palindromestring=Palindrome(str);
        if(palindromestring==true){
            System.out.println("The string is palindrome");
        }else {
            System.out.println("The string is not palindrome");
        }
    }
}
