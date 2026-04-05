package code.bai2;

import java.util.Scanner;

public class inputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String job = sc.nextLine();
        System.out.println("Your age is: " + age + ", your job is: " + job);
        sc.close();

    }
}
