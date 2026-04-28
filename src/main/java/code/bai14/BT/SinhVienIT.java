package code.bai14.BT;

public class SinhVienIT extends SinhVien {
    private String language;

    public SinhVienIT(String id, String name, Double price, Double tax, String language) {
        super(id, name, price, tax);
        this.language = language;
    }

    public void getMoney() {
        System.out.println("getMoney run");
        super.info();
    }

    public String getLanguage() {
        return language;
    }
}
