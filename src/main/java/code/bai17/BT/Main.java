package code.bai17.BT;


public class Main {
    public static void main(String[] args) {
        IPerson[] person = {new Person(), new Student()};
        for (IPerson p : person) {
            p.input();
            System.out.println(p);
        }
    }
}
