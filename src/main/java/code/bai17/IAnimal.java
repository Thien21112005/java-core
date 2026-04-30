package code.bai17;

public interface IAnimal {
    String sound();

    default void introduce() {
        System.out.println("Tôi tên là: " + getClass().getSimpleName() + ",tôi kêu: " + sound());

    }

    default boolean isLoud() {
        return sound().length() > 5;
    }
}
