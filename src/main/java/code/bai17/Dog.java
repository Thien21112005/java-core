package code.bai17;

public class Dog implements IAnimal {
    @Override
    public String sound() {
        return "Gau Gau";
    }

    @Override
    public boolean isLoud() {
        return true;
    }
}
