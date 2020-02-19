package animalexample.model;

/**
 * This class +++Insert Description Here+++
 *
 * @author Paul Bonenfant
 * @modified Navdeep Singh Thinds
 */
public class Hamster extends Animal {
    
    private String name;

    public Hamster(String name) {
        this.name = name;
    }

    @Override
    public String makeSound() {
        return "Squeak squeak";              
    }

    @Override
    public String play() {
        return name + " is running on the wheel";
    }

    @Override
    String eat() {
        return name +"Eats a NUTS";
    }
    @Override
    public String howToEat() {
        return "Please do not eat my adorable hamster "+name;
    }
}