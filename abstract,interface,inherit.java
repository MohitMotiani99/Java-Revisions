import java.util.*;

class Animal{
    public void eat(){
        System.out.println("Animal Eats");
    }
}
abstract class Mammal extends Animal{//abstract class
    public void breastFeeding(){
        System.out.println("Mammal Breastfeds");
    }
    public abstract void sleep();//abstract fun
}
class Human extends Mammal{
    public void eat(){
        System.out.println("Humans eat with their hands");
    }
    public void sleep(){//compulsory to define abstract fun when derived from abstract class
        System.out.println("Human Sleeps");
    }
}
interface Dog{//interface has all abstract funs
    public void sit();
    public String eatAgain();
}
interface DogDays{
    public void dodgeIt();
}
class Cat implements Dog,DogDays{//Multiple interface implementation
    public void sit(){
        System.out.println("Cat Sits");
    }
    public String eatAgain(){
        return "Cats Eats Again";
    }
    public void dodgeIt(){
        System.out.println("Understood the joke?");
    }
}
class Bat extends Mammal{//Multiple classes cannot be extended 
    public void eat(){
        System.out.println("Bat Eatz");
    }
    public void sleep(){
        System.out.println("Bat Sleeps");
    }
}
interface Dogfights extends Dog{//interface can extend another one but not implement
    public void fight();
}
 class DogClass implements Dogfights{
    public void fight(){
        System.out.println("Dogs fight");
    }
    public void sit(){
        System.out.println("Dogs Sit Together");
    }
    public String eatAgain(){
        return "Dogs eat Together";
    }
}
public class AnimalTest{
    public static void main(String []args){
        
        Human human =new Human();
        Bat bat =new Bat();
        human.eat();
        bat.sleep();
        
        //Mammal animal=new Mammal();//cant create abtract class objects
        Mammal mammal=new Bat();//for abtract class ,can create abj of child type
        mammal.eat();//if eat in child then that else its own
        mammal.sleep();//childs ver
        
        Cat cat=new Cat();
        cat.sit();
        System.out.println(cat.eatAgain());
        Dog d=new Cat();
        d.sit();
        cat.dodgeIt();
        
        DogClass dc=new DogClass();
        dc.fight();
        dc.sit();
        System.out.println(dc.eatAgain());
        
        //Dogfights df=new Dogfights();//interface extension of another interface cant 
                                       //cant instantiate objects becoz obv;
        
        Dog d2=new DogClass();
        //d2.fight();//d2 cant implement bcoz it is not its fun
        d2.sit();
        Dogfights df=new DogClass();
        df.fight();
        df.sit();//df can use sit bcoz it extends Dog class
    }
}
