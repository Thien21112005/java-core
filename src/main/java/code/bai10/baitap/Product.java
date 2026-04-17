package code.bai10.baitap;

public class Product {
    private String name;
    private double price;
    private double tax;

    public Product() {
    }

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public static Product nhapThongTin(String name, double price, double tax) {
        return new Product(name, price, tax);
    }

    public void xuatThongTin() {
        System.out.println("Name: " + name +
                "\nPrice: " + price +
                "\nTax: " + tax);
    }

    public double getTaxPrice() {
        return price * tax;
    }

    public static void main(String[] args) {
        Product pr = Product.nhapThongTin("hehe", 1, 2);
        pr.xuatThongTin();
        System.out.println(pr.getTaxPrice());
    }
}