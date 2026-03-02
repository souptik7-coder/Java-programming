// include bubble sort , selection sort

public class sorting {

    public static void BubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
    }
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int smallest_value=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[smallest_value]>arr[j]){
                smallest_value=j;
            }
        }
        int swap=arr[smallest_value];
        arr[smallest_value]=arr[i];
        arr[i]=swap;
        }
    }
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        System.out.print("The original array is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("The sorted array is :");
        // BubbleSort(arr);
        SelectionSort(arr);
        PrintArr(arr);
    }
}
