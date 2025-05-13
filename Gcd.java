package javaprogram;
import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=gcd_num(a,b);
        System.out.print(result);
    }
    static int gcd_num(int a,int b){
        int i;
        if(a<b)
        i=a;
        else
        i=b;
        for(i=i;i>1;i--){// starts from end to find greater number
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
}
