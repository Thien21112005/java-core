package code.bai4;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ------------------ ++");
        System.out.println("| 1. Cộng              |");
        System.out.println("| 2. Trừ               |");
        System.out.println("| 3. Kết thúc          |");
        System.out.println("++ ------------------ ++");
        Scanner sc = new Scanner(System.in);
        System.out.println("Lựa chọn của bạn là : ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Ban lua chon tinh nang cong");
                break;
            case 2:
                System.out.println("Ban lua chon tinh tru");
                break;
            default:
                System.out.println("Ban thoat chuong trinh");
                System.exit(0);
        }
        sc.close();
    }
}
