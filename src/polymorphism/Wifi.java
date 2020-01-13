package polymorphism;

public interface Wifi {
     public abstract void  searchWifi();

    public  static void m(){
         System.out.println("Hello Static Interface method");
     }


     public default void dN(){
         System.out.println("Default Method");
     }
}
