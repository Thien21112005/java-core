package code.bai6;

import java.util.*;

public class arraysort {
    //sử dụng hàm sort hoặc tự code hàm
    public static int[] sapxep(int[] a) {
        for (int i = 0; i < a.length - 1; ++i) {
            for (int j = i + 1; j < a.length; ++j) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Mang sau khi duoc sap xep: " + Arrays.toString(sapxep(arr)));

    }
}
