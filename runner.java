class Animal{  //parent class

    //Encapsulation :Encapsulation is the concept of bundling data (fields) and methods (getters/setters) that operate on the data into a single unit (class).
    // private fields with public getter and setter

    private String name;
    private int age;

    //constractor
    Animal(String name, int age){
        this.name = name;
        this.age = age;

    }
    //getter method for name
    public String getName(){
        return name;
    }
    //setter method for name
    public void setName(String name){
        this.name = name;
    }
     //getter method for age
     public int getAge(){
        return age;
    }
    //setter method for name
    public void setAge(String name){
        this.age = age;
    }
    //Abstraction: Abstraction is the concept of hiding complex implementation details and showing only the necessary features.
    //method to be overridden by child classes
    public void makeSound(){
        System.out.println("Animal make a sound");

    }
}
//child class name dog
//extend by Animal class
class Dog extends Animal {
private String breed;

//constructor
Dog(String name, int age, String breed){
    super(name, age);  //call the parent class constructor
    this.breed = breed;
}
//getter method for breed
public String getBreed(){
    return breed;
}
//setter method for breed
public void setBreed(){
    this.breed = breed;
}
//polymorphism :Polymorphism allows a method to behave differently based on the object that calls it.
// Overriding the makeSound method
@Override
public void makeSound(){
    System.out.println("Dog barks: Woof! Woof!");
}

}

public class runner{
    public static void main(String[] args) {
        //creat a animal object
        Animal myAnimal = new Animal("Generic Animal", 5);
        System.out.println("Animal name: "+ myAnimal.getName());
        System.out.println("Animal name: "+ myAnimal.getAge());
        myAnimal.makeSound();
        //create a dog object
        Dog dogAsAnimal = new Dog("Buddy", 3, "Golden Retriever");
        System.out.println("/nDog Name: "+ dogAsAnimal.getName());
        System.out.println("Dog Age: "+ dogAsAnimal.getAge());
        System.out.println("Dog Breed: "+ dogAsAnimal.getBreed());
        dogAsAnimal.makeSound();

        // Polymorphism: Using Animal reference to call Dog's method
        Animal myDogAsAnimal = new Dog("Max", 2, "labrador");
        myDogAsAnimal.makeSound();// Calls the overridden method in Dog class

    }
}