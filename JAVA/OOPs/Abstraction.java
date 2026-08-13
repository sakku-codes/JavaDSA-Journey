// to hide the irrelevant information from the user 
// the implementation of the code is hidden through the use of the interfaces used to interact with internal implemntation 
// making easy for the user 

// Abstraction in collection like sort() : this function sort here the user interact with the sort function it acts like the interface So, the implentation is abstracted 

// Abstract class can't be instantiated on its own and is designed to be the subclassed.........

// it serve as the template for the subclasses



abstract class Bird {

    abstract void fly();

    abstract void eat();

}

class Sparrow extends Bird{

    void fly(){
        System.out.println("Sparrow flying...........in a different WAY.....");
    }

    void eat(){
        System.out.println("Sparrow Eating.............");
    }
}
class Crow extends Bird{

    void fly(){
        System.out.println("Crow flying...........in a different WAY.....");
    }

    void eat(){
        System.out.println("Crow Eating.............");
    }
}


public class Abstraction{
    public static void main(String[] args) {
        Bird b = new Sparrow();

        b.fly(); // here the b object of the Bird class don't have clue about fly()and  eat() functions this make them hidden from the outte rworld
        b.eat();


        b = new Crow();
        b.fly();
        b.eat();
        }
    }

    // Abstraction Divides code into two categories : Interface and implentation so, when creating your copmponent , keep the interface separate from the implementation 
    // So, if the implemntation changes , the interfaces Stayes the same 

    // in the instance any program that uses these interfaces would remain unaffected and would require recomplilation with the most recent 
    // implementation 

    // Makes the code Modular