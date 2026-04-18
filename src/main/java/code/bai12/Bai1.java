package code.bai12;

import java.util.*;

public class Bai1 {
    //Valid input with username + password > 6 char
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập username: ");
        String username = sc.nextLine();
        System.out.print("Nhập password: ");
        String password = sc.nextLine();
        if (username.equals("thienhehe") && password.length() > 6) {
            System.out.println("Valid input");
        } else System.out.println("Invalid input");
        sc.close();
    }
}
