public class selectionsort {

    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min_value=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[min_value]){
                    min_value=j;
                }
            }
            int swap=arr[min_value];
            arr[min_value]=arr[i];
            arr[i]=swap;
        }
    }
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        System.out.println("The original array is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The sorted array is :");
        SelectionSort(arr);
        PrintArr(arr);
    }   
}
