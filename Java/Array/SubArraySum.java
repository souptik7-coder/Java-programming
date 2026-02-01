public class SubArraySum{
    // print all subarray sum
    public static void SubArraysum(int num[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
             int sum=0;
            for(int k=start;k<=end;k++){
                System.out.print(num[k]+" ");
                sum=sum+num[k];
            }
            System.out.println();
            System.out.println("The sum is : "+sum);
            if(sum>max){
                max=sum;
            }else if(sum<min){
                min=sum;
            }
            }
        }
        System.out.println("The maximum sum is :"+max);
        System.out.println("The minimum sum is :"+min);
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10};
        SubArraysum(num);
    }
}