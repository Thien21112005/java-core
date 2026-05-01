package code.bai18;

public class SinhVien {
    private String masv;
    private String ten;
    private double diem;
    private int age;

    public SinhVien(String masv, String ten, double diem, String age) throws IllegalArgumentException {
        this.masv = masv;
        this.ten = ten;
        if (diem < 0 || diem > 10) {
            throw new IllegalArgumentException("Điểm không hợp lệ ");
        }
        this.diem = diem;
        if (age.contains(".")) throw new IllegalArgumentException("Tuổi không được là số thực!");
        try {
            int tuoi = Integer.parseInt(age);
            if (tuoi < 0 || tuoi > 150)
                throw new IllegalArgumentException("Tuổi phải từ 0 đến 150!");
            this.age = tuoi;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Tuổi phải là số nguyên");
        }

    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) throws IllegalArgumentException {
        if (diem < 0 || diem > 10) {
            throw new IllegalArgumentException("Điểm không hợp lệ");
        }
        this.diem = diem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(String age) {
        if (age.contains(".")) throw new IllegalArgumentException("Tuổi không phải là số thực");
        try {
            int tuoi = Integer.parseInt(age);
            if (tuoi < 0 || tuoi > 150)
                throw new IllegalArgumentException("Tuổi phải từ 0 đến 150!");
            this.age = tuoi;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Tuổi phải là số nguyên");
        }

    }

    public static SinhVien input(String masv, String ten, double diem, String age) throws IllegalArgumentException {
        return new SinhVien(masv, ten, diem, age);
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "masv='" + masv + '\'' +
                ", ten='" + ten + '\'' +
                ", diem=" + diem +
                ", age=" + age +
                '}';
    }
}
