package javaprogram;
import java.util.Scanner;

public class railwaytime {
    static void railaway(String str){
        int h1 = (int)str.charAt(1) - '0';
        int h2 = (int)str.charAt(0) - '0';
        int hh = (h2 * 10 + h1 % 10);
     
        // If time is in "AM"
        if (str.charAt(8) == 'A')
        {
            if (hh == 12)
            {
                System.out.print("00");
                for (int i = 2; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
            else
            {
                for (int i = 0; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
        }
     
        // If time is in "PM"
        else
        {
            if (hh == 12)
            {
                System.out.print("12");
                for (int i = 2; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
            else
            {
                hh = hh + 12;
                System.out.print(hh);
                for (int i = 2; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
        }
    } 
     
    // Driver code 
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        railaway(str);
    }
    
}   
