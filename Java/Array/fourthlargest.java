public class Fourthlargest {

    // find fourth largest element in th array
    public static int FourthLargestNumber(int arr[]){
       int largest=Integer.MIN_VALUE;
       int secondlargest=Integer.MIN_VALUE;
       int thirdlargest=Integer.MIN_VALUE;
       int fourthlargest=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            fourthlargest=thirdlargest;
            thirdlargest=secondlargest;
            secondlargest=largest;
            largest=arr[i];
        }else if(arr[i]>secondlargest && secondlargest!=largest){
            fourthlargest=thirdlargest;
            thirdlargest=secondlargest;
            secondlargest=arr[i];
        }else if(arr[i]>thirdlargest && thirdlargest!=secondlargest){
            fourthlargest=thirdlargest;
            thirdlargest=arr[i];
        }else if(arr[i]>fourthlargest && fourthlargest!=thirdlargest){
            fourthlargest=arr[i];
        }
       }
       if(fourthlargest==Integer.MIN_VALUE){
        return -1;
       }
       return fourthlargest;
    }
    public static void main(String args[]){
        int arr[]={22,4,65,24,10,54,14};
        System.out.println("The fourthlargest number is :"+FourthLargestNumber(arr));
    }   
}
