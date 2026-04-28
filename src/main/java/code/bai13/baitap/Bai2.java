package code.bai13.baitap;

import java.util.*;
import java.util.regex.*;

public class Bai2 {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        Pattern p = Pattern.compile("0\\d{11}");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; ++i) {
            String str = sc.nextLine();
            lst.add(str);
        }
        for (String s : lst) {
            Matcher m = p.matcher(s);
            if (m.find()) {
                System.out.println(s + " ok");
            } else System.out.println(s + " nope");
        }
    }
}
