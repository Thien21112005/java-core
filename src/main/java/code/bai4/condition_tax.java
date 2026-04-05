package code.bai4;

import java.util.Scanner;

public class condition_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tax = sc.nextInt();
        if (tax < 10) {
            System.out.println("Khong dong thue");
        } else if (tax >= 10 && tax <= 15) {
            System.out.println("Thue 10%");
        } else if (tax > 15 && tax <= 30) {
            System.out.println("Thue 20%");
        } else {
            System.out.println("Thue 50%");
        }
        sc.close();
    }
}
