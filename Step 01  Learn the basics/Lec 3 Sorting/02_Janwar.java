// package Step 01  Learn the basics.Lec 3 Sorting;

 //Base class
class Animal{
    String name;
    String breed;

    String getBreed(){
        return breed;
    }

    String setName(String name){
        return this.name=name;
    }
    
    String getName(){
        return name;
    }
    void eat(){
        System.out.println("i m eating ");
    }
}


//Derived Class
class Dog extends Animal{
    String color;

    void setColor(){
        this.color=color;
    }
}

public class Janwar{
    public static void main(String[] args) {
       Dog d1=new Dog();
        d1.eat();
        // System.out.println();
    }
} {
    
}
