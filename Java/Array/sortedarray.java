import java.util.*;
public class sortedarray{
    public static boolean SortedArray(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4};
        boolean sortedarray=SortedArray(arr);
        if(sortedarray==true){
            System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }
    }
}