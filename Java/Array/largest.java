import java.util.*;
public class largest {
    public static int LargestNumber(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // find largest number in the array
       int numbers[]={10,45,87,100,54,125,47};
       int largest=LargestNumber(numbers);
       System.out.println("The largest number is :"+largest);
    }
}
