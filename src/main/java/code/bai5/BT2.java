package code.bai5;

import java.util.Scanner;

public class BT2 {
    //Giải phương trình bậc 2

    public static void giaiPhuongTrinhBacNhat(int b, int c) {
        if (b == 0) {
            switch (c) {
                case 0:
                    System.out.println("Phương trình vo số nghiệm");
                    break;
                default:
                    System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Nghiệm của phương trình là: x = " + (-c / (float) b));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số b: ");
        int b = sc.nextInt();
        System.out.println("Nhập vào số c: ");
        int c = sc.nextInt();
        System.out.printf("Giải phương bậc 2: %dx^2 + %dx + %d\n", a, b, c);
        switch (a) {
            case 0:
                giaiPhuongTrinhBacNhat(b, c);
            default:
                int delta = b * b - 4 * a * c;
                if (delta < 0) {
                    System.out.println("Phương trình vô nghiệm");
                } else if (delta == 0) {
                    System.out.printf("Phương trình có nghiệm kép: x = %.3f\n", (float) -b / 2 * a);
                } else {
                    System.out.println("Phương trình có 2 nghiệm phân biệt");
                    System.out.println("X1 = " + (-b + Math.sqrt(delta)) / 2 * a);
                    System.out.println("X2 = " + (-b - Math.sqrt(delta)) / 2 * a);
                }

        }

    }
}
