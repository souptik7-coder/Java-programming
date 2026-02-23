public class pairarraysum {
    public static void PairArraySum(int num[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){          // another process : for(int i=0;i<num.length-1;i++){}
            int value=num[i];
            int sum=0;
            boolean a=false;                     // then boolean a=false is not necessary 
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+value+","+num[j]+")");
                sum=sum+num[j]+value;
                a=true;                          // no need
            }
            if(a){
                System.out.println();
                System.out.println("The sum is :"+sum);    // not necessary
            if(sum>max){
                max=sum;
            }else if(sum<min){
                min=sum;
            }
        }
    }
        System.out.println("The maximum number is :"+max);
        System.out.println("The minimum number is :"+min);
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10};
        PairArraySum(num);
    }
}
