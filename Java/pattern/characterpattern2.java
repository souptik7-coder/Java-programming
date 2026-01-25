import java.util.*;
public class characterpattern2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=n-i+1;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
