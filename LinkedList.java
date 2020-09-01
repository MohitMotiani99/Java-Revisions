import java.util.*;

public class LinkedListClass{//identical to ArrayList
//has all of ArrayList methods bcoz they implement same interface "List"
//ArrayList uses array--if full creates a new array
//LinkedList elements stored in container each container has a link to next one
//ArrayList use whenrandom access & size known && add/remove at end
//LinkedList--cant access random elements ,only thru looping use when freq add/rem in
  //in beg or middle.
  

    public static void main(String[] args){
        LinkedList<String> cars=new LinkedList<String>();//like a vector
        int[] arr={1,2,33};
        cars.add("A");
        cars.add("B");//insert an element
        cars.add("C");
        cars.add("D");
        System.out.println(cars);//direct print in ArrayList;
        System.out.println(arr);//returns address of the array not printing the elements
        
        System.out.println(cars.get(0));//access an element
        //System.out.println(cars[0]);//cant may be becoz ds is private so getters and setters
        
        cars.set(0,"X");//modify
        System.out.println(cars.get(0));
        
        cars.remove(0);//remove an elemnt from this index
        System.out.println(cars.get(0));
        
        System.out.println(cars.size());//size
        
        Collections.sort(cars);//sort in asc
        System.out.println(cars);
        
        Collections.sort(cars,Collections.reverseOrder());//sort in desc
        System.out.println(cars);
        
        Collections.reverse(cars);//reverse
        System.out.println(cars);
        
        //Some Additional Linked List Specific Methods
        
        cars.addFirst("A");
        cars.addLast("E");
        System.out.println(cars);
        
        cars.removeFirst();
        cars.removeLast();
        System.out.println(cars);
        
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        cars.clear();//remove all
        
        System.out.println(cars.getFirst());//
        System.out.println(cars.getLast());//both give exception when ll is empty
        
        System.out.println(cars.size());
    }
}
