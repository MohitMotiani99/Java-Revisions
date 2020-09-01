import java.util.*;

public class MyClass implements Runnable{
   static int amount=0;
   public void run(){
        System.out.println("Thready");
        amount++;
    }
   public static void main(String[] args){
        MyClass obj=new MyClass();
        Thread t=new Thread(obj);
        t.start();
        System.out.println("Mainy");
        System.out.println(amount);
        while(t.isAlive())
        System.out.println("Waiting...");
        
        amount++;
        System.out.println(amount);
        
        
   }
}
