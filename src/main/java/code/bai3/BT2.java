package code.bai3;

import java.util.*;

public class BT2 {
    //Chu vi, diện tích, cạnh nhỏ nhất của hình chữ nhật
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Dien tich cua hcn la: " + a * b);
        System.out.println("Chu vi cua hcn la: " + (a + b) * 2);
        System.out.println("Canh ngan: " + Math.min(a, b));


    }
}
