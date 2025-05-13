package javaprogram;
import java.util.*;
public class Diagonaldiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
           // System.out.print(arr[i][j]+" ");
          }
        }
        diagonaldifference(arr);
    }
    public static void diagonaldifference(int a[][]){
        int size=a.length,major=0,minor=0;
        for(int r=0;r<size;r++){
            for(int c=0;c<size;c++){
                if(r==c)
                {
                    major+=a[r][c];
                }  
                if(r+c==size-1){
                    minor+=a[r][c];
                }      
            }
        }
        System.out.println( Math.abs(major-minor));
    }
}
