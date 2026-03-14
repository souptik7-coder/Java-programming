public class binarysearch {

    public static int BinarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                ans=mid;
                end=mid-1;  // search for left 
            }else if(arr[mid]>key){
                end=mid-1;
            }else if(arr[mid]<key){
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]={2,4,6,6,8,10};
        int key=6; 
        int ans=BinarySearch(arr, key);
        if(ans==-1){
            System.out.println("The element is not found");
        }   else {
            System.out.println("The element is found at "+ans+"th position");
        }
    }
}
