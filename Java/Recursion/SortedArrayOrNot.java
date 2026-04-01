import java.util.*;
public class SortedArrayOrNot {
    public static boolean SortedArray(int arr[],int n){
        if(n==arr.length-1){
            return true;
        }
        if(arr[n]>arr[n+1]){
            return false;
        }
        return SortedArray(arr, n+1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        boolean SortedArray=SortedArray(arr, 0);
        if(SortedArray==true){
            System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }
    }
}
