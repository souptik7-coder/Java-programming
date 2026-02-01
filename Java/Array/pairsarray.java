public class pairsarray {
    public static void PairArray(int num[]){
            for(int i=0;i<num.length;i++){
                int value=num[i];
                for(int j=i+1;j<num.length;j++){
                    System.out.print("("+num[i]+","+num[j]+") ");
                }
                System.out.println();
            }
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10};
        PairArray(num);
    }   
}
// pairs in an Array
