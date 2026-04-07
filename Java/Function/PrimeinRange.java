import java.util.*;
public class PrimeinRange {

    public static boolean PrimeNumber(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }else{
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
    }
        return true;
    }

    public static void PrimeInRange(int number){

        if(number<2){
            System.out.println("No number in this range");
        }
        for(int i=2;i<=number;i++){
            if(PrimeNumber(i)==true){
                System.out.println(" "+i);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=10;
        PrimeInRange(number);
    }
}
