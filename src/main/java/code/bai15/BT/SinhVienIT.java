package code.bai15.BT;

public class SinhVienIT extends SinhVien {
    private double scoreJava;
    private double scoreHTML;

    public SinhVienIT(double scoreJava, double scoreHTML) {
        super();
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }


    @Override
    public double tinhDiem() {
        return (scoreJava * 2 + scoreHTML) / 3;

    }
}
