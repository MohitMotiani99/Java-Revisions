import java.util.*;

public class HashSetClass{//identical to ArrayList
   public static void main(String[] args){
       HashSet<String> cc=new HashSet<String>();
       
       cc.add("England");//insert element
       cc.add("Germany");
       cc.add("India");
       cc.add("USA");
       
       System.out.println(cc);//print
       
       System.out.println(cc.contains("England"));//check availability
       
       cc.remove("India");//remove 
       System.out.println(cc);
       
       System.out.println(cc.size());//size
       
       
       for(String i:cc){//set of values
           System.out.print(i+" ");
       }
       System.out.println();
   }
}
