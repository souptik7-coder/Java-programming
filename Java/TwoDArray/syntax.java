import java.util.*;
public class syntax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[4][4];
        int n=matrix.length;  // for row
        int m=matrix[0].length;   // for column
        for(int i=0;i<n;i++){      // outer loop :-row
            for(int j=0;j<m;j++){     // inner loop :-column
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
