package javaprogram;
import java.util.*;
import java.io.*;
public class reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String a[]=str.split(" ");
        int len=a.length;
        String t=new String();
        for(int i=len-1;i>=0;i--){
            t+=a[i]+" ";
        }
       System.out.println(t);
}
}
