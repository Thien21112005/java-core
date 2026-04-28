package code.bai15.BT;

public abstract class SinhVien {
    abstract double tinhDiem();

    public void printDiem() {
        System.out.printf("%.3f \n", tinhDiem());
    }
}
