public class thirdlargest {
    
    // find thirdlargest in the array
    public static int Thirdlargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        int thirdlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                thirdlargest=secondlargest;
                secondlargest=largest;
                largest=arr[i];
            }else if(secondlargest>arr[i] && secondlargest<largest){   // find secondlargest
                thirdlargest=secondlargest;
                secondlargest=arr[i];
            }else if(thirdlargest>arr[i] && thirdlargest<secondlargest && thirdlargest<largest){    // find thirdlargest
                thirdlargest=arr[i];
            }
        }if(thirdlargest==Integer.MIN_VALUE){
            return thirdlargest;
        }
        return thirdlargest;
    }
    public static void main(String args[]){
        int arr[]={7,2,8,10,20,5,6,14};
        System.out.println("The third largest number is :"+Thirdlargest(arr));
    }
}
