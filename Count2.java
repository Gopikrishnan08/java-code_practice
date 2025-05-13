package javaprogram;
import java.util.Scanner;
import java.io.*;
public class Count2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int vow=0,num=0,space=0,symbol=0,con=0;
        for(int i=0;i<s.length();i++){
            if( s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vow++;
            }
            else if(s.charAt(i)>=48 && s.charAt(i)<=57){
                num++;
            }
            else if(s.charAt(i)==32){
                space++;
            }
            else if((s.charAt(i)>=33 && s.charAt(i)<=47)||s.charAt(i)>=58 && s.charAt(i)<=64){
                symbol++;
            }
            else{
                    con++;
            }
        }
            System.out.print(vow+" "+num+" "+space+" "+symbol+" "+con+" ");
    }
}
