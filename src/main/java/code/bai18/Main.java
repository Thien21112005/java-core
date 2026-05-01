package code.bai18;


import java.util.*;

public class Main {

    public static void NhapThongTin() {
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        while (running) {
            try {
                System.out.print("Nhập mã sinh viên: ");
                String id = sc.nextLine();
                System.out.print("Nhập tên sinh viên: ");
                String name = sc.nextLine();
                System.out.print("Nhập điểm sinh viên: ");
                double diem = sc.nextDouble();
                System.out.print("Nhập tuổi sinh viên: ");
                sc.nextLine();
                String age = sc.nextLine();
                SinhVien sv = SinhVien.input(id, name, diem, age);
                System.out.println(sv);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                running = false;
            }
        }

    }

    public static void main(String[] args) {
        NhapThongTin();

    }

}
