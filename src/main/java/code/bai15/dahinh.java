package code.bai15;

import java.util.ArrayList;

public class dahinh {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog()};
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
