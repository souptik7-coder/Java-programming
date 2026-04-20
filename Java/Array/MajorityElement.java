import java.util.*;
public class MajorityElement {

    public static int majorityElement(int arr[]){
        int n=arr.length;
        for(int val:arr){
            int freq=0;
            for(int el:arr){
                if(val==el){
                    freq++;
                }
            }
            if(freq>n/2){
                    return val;
                }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={5,4,2,1,1,1,1,1,4};
        System.out.println(majorityElement(arr));
    }
}
