package code.bai11;

import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> lst = new ArrayList<>();
        while (true) {
            System.out.println("Nhập vào số thực bất kì: ");
            double input = sc.nextDouble();
            lst.add(input);
            sc.nextLine();
            System.out.println("Bạn muốn nhập tiếp: (Y) or (N)");
            String option = sc.nextLine();
            if (option.equalsIgnoreCase("n")) {
                break;
            }
        }
        double sum = 0;
        for (Double a : lst) {
            sum += a;
        }
        System.out.println("Tổng mảng này là: " + sum);
    }
}
