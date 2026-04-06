package code.bai5;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        //Giải phương trình bậc 1
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (a) {
            case 0:
                if (b == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
                break;

            default:
                System.out.println("Nghiệm của phương trình là: x = " + (-b / (float) a));
                break;
        }
    }
}
