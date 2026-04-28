package code.bai14.BT;

public class SinhVien {
    protected String id;
    protected String name;
    protected Double price;
    protected Double tax;


    public SinhVien(String id, String name, Double price, Double tax) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public Double getTaxPrice() {
        return price * tax;
    }

    public void info() {
        System.out.println("info run");
    }
}
