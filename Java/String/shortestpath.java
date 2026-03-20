import java.util.*;
public class shortestpath {
    
   public static float Shortestpath(String str){
    int x=0,y=0;
    for(int i=0;i<str.length();i++){
        char direction=str.charAt(i);
        // North
        if(direction=='N'){
            y++;
        }
        //South
        else if(direction=='S'){
            y--;
        }
        //East
        else if(direction=='E'){
            x++;
        }
        //West
        else if(direction=='W'){
            x--;
        }
    }
    int X=x*x;
    int Y=y*y;
    return (float)Math.sqrt(X+Y);
   } 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str="WNEENESENNN";
        System.out.println("The shortest path is :"+Shortestpath(str));
    }
}
