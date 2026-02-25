public class Kadanesalgo {
    
    // Kadanes algorithm
    
    public static void KadanesAlgo(int numbers[]){
        int max=Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0;i<numbers.length;i++){
            currentsum=currentsum+numbers[i];
            System.out.println("The all sum is :"+currentsum);
            if(currentsum<0){
                currentsum=0;
            }
            max=Math.max(currentsum,max);
        }
        System.out.println("The maximum number is :"+max);
    }
    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,3};
        KadanesAlgo(numbers);
    }
}
