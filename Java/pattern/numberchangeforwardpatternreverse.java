import java.util.*;
public class numberchangeforwardpatternreverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=10;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=4-i+1;j++){
                System.out.print(" "+num);
                num--;
            }
            System.out.println();
        }
    }
}