package code.bai15.BT;


public class Main {
    public static void main(String[] args) {
        SinhVien[] lstsv = {new SinhVienIT(9.2, 9.1), new SinhVienCoKhi(4.5, 5.0)};
        for (SinhVien sv : lstsv) {
            sv.printDiem();
        }
    }
}
