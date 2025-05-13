package javaprogram;
interface hero123{
    abstract void onestop();
        void twostop();
    }
public class Interfaceuse implements hero123{
    public void onestop(){
        System.out.println("stop once");
    }
    public void twostop(){
        System.out.println("stop twice");
    }
    public static void main(String[] args) {
        Interfaceuse h=new Interfaceuse();
        h.onestop();
        h.twostop();
        
    }
}
