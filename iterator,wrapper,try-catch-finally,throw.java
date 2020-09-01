import java.util.*;

public class MyClass{//identical to ArrayList
   public static void main(String[] args){
       HashSet<String> cc=new HashSet<String>();
       
       cc.add("England");//insert element
       cc.add("Germany");
       cc.add("India");
       cc.add("USA");
       
       //Iterators
       
       Iterator<String> it=cc.iterator();
       System.out.println(it.next());
       //loop
       while(it.hasNext()){
           String i=it.next();//value of the elemnt of iter;
           if(i!="India")
           it.remove();//remove element using itearaor
       }
       System.out.println(cc);
       
       
       
       //Wrapper classes:-to use prim data types as obj
        //ArrayList can only use objects as element so we have to use Integer wrapper 
        //class rather than just int
        /*
        Integer--intValue()
        Double--doubleValue()
        Charachter--charValue()//to get value 
        
        Integer inti=10;
        String str=inti.toString()
        
        */
        //try catch
        
        try{
            int x=1/0;
        }
        catch(Exception e){
            System.out.println("Div By 0 Simps");
        }finally{
            System.out.println("finale");
        }
        System.out.println(1);
        
        //throw
        
            int age=17;
            if(age<18)
            throw new ArithmeticException("Get Out");
        
        
   }
}
