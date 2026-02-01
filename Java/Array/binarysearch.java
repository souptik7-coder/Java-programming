public class binarysearch {
    public static int BinarySearch(int num[],int search_key){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]>search_key){
                end=mid-1;
            }else if(num[mid]<search_key){
                start=mid+1;
            }else if(num[mid]==search_key){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10,12};
        int search_key=8;
        int ans=BinarySearch(num, search_key);
        if(ans==-1){
            System.out.println("The given index is not found");
        }else{
            System.out.println("The given index is : "+ans);
        }
    }
}
