package javaprogram;
import java.util.*;
public class ConvertString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char a[]=s.toCharArray();
        String  s2;
        for(int i=0;i<a.length;i++){
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
                System.out.print((char)(a[i]+1));
            }
            else{
                System.out.print("%");
            }
        }

    }
}
