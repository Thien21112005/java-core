package code.bai5;

import java.util.*;

public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiendien = sc.nextInt();
        if (tiendien <= 10) {
            System.out.println("Số tiền điện là: " + tiendien * 1000);
        } else {
            System.out.println("Số tiền điện là: " + (10 * 1000 + (tiendien - 10) * 1500));
        }
    }
}
