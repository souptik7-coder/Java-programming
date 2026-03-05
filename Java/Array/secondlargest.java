// find second largest element in the array
public class secondlargest {
   public static int SecondLargestNumber(int arr[]){
    int largest=Integer.MIN_VALUE;
    int secondlargest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            secondlargest=largest;
            largest=arr[i];
        }else if(arr[i]>secondlargest && secondlargest!=largest){
            secondlargest=arr[i];
        }
    }
    if(secondlargest==Integer.MIN_VALUE){
        return -1;
    }
    return secondlargest;
   }
 public static void main(String args[]){
        int arr[]={5,10,4,8,11};
        System.out.println("The largest number is :"+SecondLargestNumber(arr));
 }   
}
