package animalexample.model;

/**
 * This class represents a cat
 *
 * @author Paul Bonenfant
 * @modified Navdeep Singh Thind
 */
public class Cat extends Animal {

    private String name;

    public Cat(String name) {
        this.name = name;        
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }

    public String makeSound(boolean scared) {

        if (scared) {
            return "Hiss!!!";
        } else {
            return makeSound();
        }
    }

    @Override
    String play() {
        return "Cat Plays With a ball";
    }

    @Override
    String eat() {
        return "Cat eats mice";
    }

   @Override
    public String howToEat() {
        return "Please do not not eat my cute cat "+ name;
    }

}
