import java.util.*;
public class smallest {
    public static int SmallestNumber(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // find smallest number in the array
        int numbers[]={55,45,12,10,88,100,5,87,100};
        int smallest=SmallestNumber(numbers);
        System.out.println("The smallest number is : "+smallest);
    }
}
