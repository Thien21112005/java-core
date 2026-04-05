package code.bai3;

import java.util.Scanner;

public class BT1 {
    //In ra màn hình thông tin cá nhân vừa nhập
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Your name is: " + name + ", your age is: " + age);

    }
}
