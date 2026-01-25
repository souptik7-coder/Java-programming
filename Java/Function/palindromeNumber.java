// import java.util.*;
// public class palindromeNumber{
//     public static void Number(int n){
//             int i=1;
//             int number=n;
//             int reverse=0;
//             while(n>0){
//                 int lastdigit=n%10;
//                 reverse=(reverse*10)+lastdigit;
//                 n=n/10;
//             }
//             if(reverse==number){
//                 System.out.println("The number is palindrome");
//             }else{
//                 System.out.println("The numbner is not plaindrome");
//             }
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int n=sc.nextInt();
//         Number(n);
//     }
// }
// ** ANOTHER METHOD**
import java.util.*;
public class palindromeNumber{
    public static boolean Number(int n){
        int palindorme=n;
        int reverse=0;
        while(n>0){
            int lastdigit=n%10;
            reverse=(reverse*10)+lastdigit;
            n=n/10;
        }
        if(palindorme==reverse){
                return true;
        }else{
                return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter your number:");
        int n=sc.nextInt();
        if(Number(n)){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not plaindrome");
        }
    }
}