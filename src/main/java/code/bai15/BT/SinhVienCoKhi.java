package code.bai15.BT;

public class SinhVienCoKhi extends SinhVien {

    private double scoreCNC;
    private double scorePLC;

    public SinhVienCoKhi(double scoreCNC, double scorePLC) {
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;
    }

    @Override
    public double tinhDiem() {
        return (scoreCNC + scorePLC) / 2;
    }
}
