// search element in the array

import java.util.Scanner;

public class searchelement {

    public static boolean SearchElement(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(key==arr[i][j]){
                    System.out.print("The element is at :"+"("+i+","+j+")" );
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][4];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        } 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        SearchElement(arr, 4);
    }    
}
