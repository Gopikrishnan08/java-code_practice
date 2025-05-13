package javaprogram;
import java.util.*;
class wicket{
    void Keeping()
    {
        System.out.println("he caught the vijay shanker battip ball to take a wicket");
    }
}
class record1 extends wicket{
    void stats(){
        System.out.println(" he did 500 stumpit in cricket");
    }
}
public class singleinheritence {
    public static void main(String[] args) {
    record1 msd=new record1();
     msd.Keeping();
     msd.stats();
}
}