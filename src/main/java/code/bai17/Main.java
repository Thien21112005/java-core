package code.bai17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IAnimal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cow());
        for (IAnimal iAnimal : animals) {
            iAnimal.introduce();
            System.out.println(iAnimal.isLoud() ? "Ồn" : "Không ồn");
        }
    }
}
