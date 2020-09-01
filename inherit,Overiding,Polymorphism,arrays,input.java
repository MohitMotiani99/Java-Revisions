import java.util.*;

class Animal{
    public void eat(){
        System.out.println("Animal Eats");
    }
}
class Mammal extends Animal{
    public void breastFeeding(){
        System.out.println("Mammal Breastfeds");
    }
}
class Human extends Mammal{
    public void eat(){
        System.out.println("Humans eat with their hands");
    }
}
class Dog extends Mammal{
    public void eat(){
        System.out.println("Dog Eats");
    }
    public String eatAgain(){
        return "Dog Eats";
    }
}
class Cat extends Mammal{
    public void eat(){
        System.out.println("Cat Eats");
    }
}
public class AnimalTest{
    public static void main(String []args){
        
        //Animal Class Animal Obj
        Animal animal=new Animal();
        animal.eat();
        //Human Class Human Obj
        Human human =new Human();
        human.eat();
        //Animal Class Human Obj
        Animal animal2=new Human();//Dynamic Method Dispatch//Decides at runtime
        animal2.eat();
        //Human Class Animal Obj
        //Human human2=new Animal();
        //human2.eat();
        //==>Children cant take parent type obj
        
        //When parents use child obj even if the fun is not overridden then they will
        //use their own version.
        
        Animal[] animals=new Animal[3];//array in java
        animals[0]=new Human();
        animals[1]=new Dog();
        animals[2]=new Cat();
        
        for(int i=0;i<animals.length;i++){//arr.length=Length of array
            animals[i].eat();//Polymorphism:Parent Class obj can behave as any child class
        }
        for(Animal i : animals){//For Each Loop 
            i.eat();
        }
        
        Scanner scan=new Scanner(System.in);//take input
        int n =Integer.parseInt(scan.nextLine());//str to int
        Dog dogDays=new Dog();
        String[][] animals2=new String[n][n];//2d array
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                animals2[i][j]=dogDays.eatAgain();
                
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //animals[i][j]=dogDays.eat();
                System.out.print(animals2[i][j]+" ");//string concats//print without line change
            }
            System.out.println();//new line
        }
        
        int x=scan.nextInt();//int input
        System.out.println(x);
        double f=scan.nextDouble();//float/double input
        System.out.println(f);
        
        Animal animalDog=new Dog();
        animalDog.eat();
        //animalDog.eatAgain();//But the parent class obj cant call an orig child fun
        
        
    }
}
