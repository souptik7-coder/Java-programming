import java.util.*;
public class halfpyramidpattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){ // outer loop 
            for(int j=1;j<=i;j++){ // inner loop 
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
