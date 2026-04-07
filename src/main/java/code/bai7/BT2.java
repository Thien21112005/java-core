package code.bai7;

import java.util.*;

public class BT2 {
    //Bang cuu chuong
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao bang cuu chuong: ");
        int n = sc.nextInt();
        System.out.printf("Bang cuu chuong %d\n", n);
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d x %d = %d \n", n, i, n * i);
        }
        sc.close();
    }
}
