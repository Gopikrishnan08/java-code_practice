package javaprogram;
abstract class hero {
    void onestop(){
        System.out.println("stop once");
    }
    abstract void twostop();
}
public class abstraction extends hero{
    void twostop(){
        System.out.println("stop twice");
    }
    public static void main(String[] args) {
        abstraction a=new abstraction();
        a.onestop();
        a.twostop();

    }
}
