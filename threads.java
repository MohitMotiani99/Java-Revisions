class MyRunnableClass implements Runnable{
    public void run(){
        System.out.println("Inside new Thread");
    }
}
public class RunnableTest{
    public static void main(String[] args){
        System.out.println("Inside Main Thread");
        MyRunnableClass runnable=new MyRunnableClass();
        Thread thread=new Thread(runnable);
        thread.start();
        System.out.println("Inside Main Thread");
    }
}
//1 public class per file
