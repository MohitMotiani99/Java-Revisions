import java.util.*;

public class ArrayListClass{
    public static void main(String[] args){
        ArrayList<String> cars=new ArrayList<String>();//like a vector
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
        
        cars.clear();//remove all
        
        System.out.println(cars.size());
    }
}
