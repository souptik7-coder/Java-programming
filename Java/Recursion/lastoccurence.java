import java.util.*;
public class lastoccurence {

    public static int LastOccurence(int arr[],int i,int key){
        if(arr.length==i){
            return -1;

        }
        int found=LastOccurence(arr, i+1, key);
        if(found==-1 && arr[i]==key){
            return i;
        }
        return found;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={5,4,3,4,8,9};
        System.out.println(LastOccurence(arr, 0, 4));
    }
}
