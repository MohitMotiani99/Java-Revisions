import java.util.*;

public class LinkedListClass{//identical to ArrayList
   public static void main(String[] args){
       HashMap<String,String> cc=new HashMap<String,String>();
       
       cc.put("England", "London");//insert key value pair
       cc.put("Germany", "Berlin");
       cc.put("India", "Delhi");
       cc.put("USA", "DC");
       
       System.out.println(cc);//print
       
       System.out.println(cc.get("USA"));//access
       
       cc.remove("India");//remove by key
       System.out.println(cc);
       
       System.out.println(cc.size());
       
       //Loop with keys
       for(String i:cc.keySet()){//set of keys
           System.out.print(i+" ");
       }
       System.out.println();
       
       //Loop with values
       for(String i:cc.values()){//set of values
           System.out.print(i+" ");
       }
       System.out.println();
   }
}
