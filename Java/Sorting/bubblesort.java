public class bubblesort{
    public static void BubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int c=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=c;
                }
            }
        }
    }
    public static void Printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
   }
}
    public static void main(String args[]){
        int arr[]={5,7,9,2,4,1};
        System.err.print("The array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("The sorted array is :");
        BubbleSort(arr);  
        Printarr(arr);  
    }
}