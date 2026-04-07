package code.bai7;

import java.util.Scanner;
import java.util.Arrays;

public class BT3 {
    //sort, max, min array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.printf("Nhập vào phần tử thứ %d: ", i + 1);
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length - 1]);
        System.out.println(arr[0]);

    }

}
