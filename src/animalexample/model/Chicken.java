/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalexample.model;

/**
 *
 * @author Navdeeep Singh Thind
 */
public class Chicken extends Animal implements Edible {

    @Override
    String play() {
        return "Chicken plays";
    }

    @Override
    String makeSound() {
        return "Chicken makes sound cheek cheek";

    }

    @Override
    String eat() {
        return "Chicken eats Worms";

    }

    @Override
    public String howToEat() {
        return "fry it";
    }

}
