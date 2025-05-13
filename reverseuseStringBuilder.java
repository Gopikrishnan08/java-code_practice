package javaprogram;
import java.util.Scanner;
import java.io.*;

public class reverseuseStringBuilder {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       StringBuilder z=new StringBuilder(s);
       System.out.println(z.reverse());
    }
}
