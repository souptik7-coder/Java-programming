public class prefixsubarraysum {
    
    public static void Prefixsum(int numbers[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<numbers.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];   // build subarray
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;
        sum=start==0?prefix[end]:prefix[i-1]+prefix[start-1];
        System.out.println("The sum is :"+sum);
        if(sum>max){
            max=sum;
        }
        }
        }
        System.out.println("The maximum sum is :"+sum);
    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        Prefixsum(numbers);
    }
}
