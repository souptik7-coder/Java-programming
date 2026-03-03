import java.util.Arrays;
import java.util.Collections;
public class Inbuiltsort{
    
    public static void PrintArr(Integer arr[]){
        for(Integer i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Integer arr[]={7,9,4,5,2,1};
        System.out.println("The unsorted array is :");
        for(Integer i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("The sorted array is :");
        // Arrays.sort(arr,0,4);
        Arrays.sort(arr,0,5,Collections.reverseOrder());
        PrintArr(arr);
    }
}