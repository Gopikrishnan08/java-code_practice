package javaprogram;
import java.util.Scanner;

public class revvowstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        reverse(s);    
    }
    static boolean vowel(char ch){
        return (ch=='a'||ch=='e'||ch=='i'|ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
   }
    static void reverse(String str){
        int i=0;
        int j=str.length()-1;
        char c[]=str.toCharArray();
        while(i<j){
            if (!vowel(c[i]))
            {
                i++;
                continue;
            }
            if (!vowel(c[j]))
            {
                j--;
                continue;
            }
            char t = c[i];
            c[i]= c[j];
            c[j]= t;

            i++;
            j--;
        }
        System.out.println(c);
    }
   
}
