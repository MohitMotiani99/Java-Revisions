/*

Access Levels/Modifiers:-

NAME              WHO CAN DAWN IT?                            WHO CAN ACCESS IT?      

public            var,methods,constr,classes,interface        even a diff package

protected         var,methods,constr                          in same package -everyone
                                                              other pachage- subclasses

default           var,methods,constr,classes,interface        same package-everyone

private           var,methds,constr                           just in same class

*/

/*
Modifiers:-

NAME              WHO MCAN DAWN IT?         NOTES

static            members of class          ClassName.staticMember
                                            method:-static int myfun(){}

final             class,members of class    for var-constant value cannot be changed
                                                method-cant be overridden
                                                class-cant be subclassed

abstract          class,methods

*/

/*
Constructors:

    public classname(){
    }

    no return type
*/
/*

Encapsulation:-sensitive daa hidden(private) ,use getters & setters
                :-can make class read only or write only
                :-security

final class cant be inherited

*/
import java.util.*;
class outer{
    int x=5;
    class inner{
        int y=5;
        int z=x+5;//inner class can access outer class's members;
    }
}

public class mainClass{
    public static void main(String[] args){
        outer out=new outer();
        outer.inner in=out.new inner();//OuterClassName.InnerClassname=outerObj.new InnerObj();
        //if inner class is private then it will give error
        //if inner static can be accessed withput creating obj of outer
        System.out.println(out.x+in.y);
        //System.out.println(out.x+out.y);//outer class cant access inner class var by directly using its obj
        //System.out.println(in.x+in.y);//similarly for inner class
    }
}
/*
Interface methods are by default abstract and public

enum:
    
    enum Level{
        LOW,MID,HIGH
    }
    values are capital
    Level myvar=Level.LOW;
    for(Level myvar:Level.values()){
        S.O.P(myvar);
    }
    enum can have methds
    enums constants are public ,final & static
    cant instantiate it
    cant extend classes
    can implement interfaces
    

        
 */


