package animalexample.model;

/**
 * This class represents a dog
 *
 * @author Paul Bonenfant
 * @modified Navdeep Singh Thind
 */
public class Dog extends Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String play() {
        return name + " is playing with a ball";
    }

    @Override
    String makeSound() {
        return "Dog Makes Soudd Bhauuuu Bhauuuu";
    }

    @Override
    String eat() {
        return "Dog eats pedeguri";
    }
@Override   
public String howToEat() {
        return "Please do not eat my lovely dog " +name;
    }

}
