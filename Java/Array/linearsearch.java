// Linear Search Program
import java.util.*;
public class linearsearch {
    public static int LinearSearch(int values[],int key){
        for(int i=0;i<values.length;i++){
            if(values[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int values[]={2,4,6,8,10,12,14,16,18,20};
        int key=12;
        int ans=LinearSearch(values, key);
        if(ans==-1){
            System.out.println("The element is not exixts");
        }else{
            System.out.println("The element is exixts at "+ans+"th position");
        }
    }
}
