package javaprogram;
import java.util.*;
public class matixmagic {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        //int mat[][]=new int[size][size];
        generatemagic_matrix(size);
        scan.close();
    }
    public static void generatemagic_matrix(int size){
        int mat[][]=new int[size][size];
        int row=0;//move 1 step up;
        int col=size/2;// move 1 step right
        for(int num=1;num<=size*size;num+=1){
            mat[row][col]=num;
            if(row>=0 && col==size){  //row ava but col not available
                col=0;// goton first col
            }
            else if(row==-1 && col<size){  //row not ava but col available
                row=size-1; // move to last row
            }
            else if(row>=0 && col<size&& mat[row][col]==0){
                continue;
            }
            else { //row and col not available
                row+=2 ;
                col-=1 ;
            }
        }
        System.out.println("Magic Matrix: ");
        for(int[] rows: mat) {
            for(int value: rows){
                System.out.print(value +"\t");
            }
            System.out.println();
        }

    }
}
