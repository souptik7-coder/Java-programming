import java.util.*;
public class arraysortedroated {

    public static boolean RoatedSorted(int arr[]){
        int n=arr.length;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[(i+1)%n]){
                count++;
            }
        }
        return count<=1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={2,4,6,8,10};
        System.out.println(RoatedSorted(arr));
    }
}
