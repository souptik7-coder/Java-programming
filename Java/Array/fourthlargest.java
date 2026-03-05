public class Fourthlargest {

    // find fourth largest element in th array
    public static int Fourthlargest(int arr[]){
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
            }else if(largest>arr[i] && secondlargest<arr[i]){
                fourthlargest=thirdlargest;
                thirdlargest=secondlargest;
                secondlargest=arr[i];
            }else if(secondlargest>arr[i] && thirdlargest<arr[i]){
                fourthlargest=thirdlargest;
                thirdlargest=arr[i];
            }else if(thirdlargest>arr[i] && fourthlargest<arr[i]){
                fourthlargest=arr[i];
            }
        }
        return fourthlargest;
    }
    public static void main(String args[]){
        int arr[]={22,4,65,24,10,54,14};
        System.out.println("The fourthlargest number is :"+Fourthlargest(arr));
    }   
}
