import java.util.*;
public class FirstOccurence {
    public static int FirstOccurence(int arr[],int i,int key){
        if(arr.length==i){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOccurence(arr, i+1, key);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={5,4,3,4,8,9};
        System.out.println(FirstOccurence(arr, 0, 4));
    }
}
