package code.bai14.BT;

public class SinhVienCoKhi extends SinhVien {
    private String skill;

    public SinhVienCoKhi(String id, String name, Double price, Double tax, String skill) {
        super(id, name, price, tax);
        this.skill = skill;
    }
}
