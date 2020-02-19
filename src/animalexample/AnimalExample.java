package animalexample;

import animalexample.model.Apple;
import animalexample.model.Cat;
import animalexample.model.Chicken;
import animalexample.model.Dog;
import animalexample.model.Hamster;

/**
 * This class is the Main class for a simple Inheritance example
 *
 * @author Paul Bonenfant
 * @modified Navdeep Singh Thind
 */
public class AnimalExample{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cat cat = new Cat("Fluffy");
        Dog dog = new Dog("Lucky");
        Hamster hamster = new Hamster("Hammy");
        Apple apple = new Apple();
        Chicken chicken = new Chicken();

        System.out.println(dog.howToEat());
        System.out.println(hamster.howToEat());
        System.out.println(cat.howToEat());
        System.out.println(chicken.howToEat());
        System.out.println(apple.howToEat());
      

    }
}
