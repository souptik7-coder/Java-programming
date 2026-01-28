import java.util.*;
public class Passingargument {
    public static void Update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void Number(float numbers[]){
        for(int i=0;i<numbers.length;i++){
            numbers[i]=numbers[i]/100;
        }
    }
    public static void Squares(int values[]){
        for(int i=0;i<values.length;i++){
            values[i]=values[i]*values[i];
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks[]={99,54,74};
        float numbers[]={97589,58746,5987};
        Update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println("The marks are : "+marks[i]);
        }
        Number(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.println("The numbers are "+numbers[i]);
        }
        int values[]={5,7,9};
        Squares(values);
        for(int i=0;i<values.length;i++){
            System.out.println("The square is :"+values[i]);
        }
    }
}