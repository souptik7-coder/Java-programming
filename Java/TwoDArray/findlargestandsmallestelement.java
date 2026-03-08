import java.util.*;
public class findlargestandsmallestelement {
    public static void Element(int arr[][]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }if(arr[i][j]<smallest){
                    smallest=arr[i][j];
                }
            }
        }
        System.out.println("The smallest numer is :"+smallest);
        System.out.println("The largest numer is :"+largest);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][4];
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        Element(arr);
    }   
}
