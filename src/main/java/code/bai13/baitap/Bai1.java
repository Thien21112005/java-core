package code.bai13.baitap;

import java.util.*;
import java.util.regex.*;

public class Bai1 {
    //Check password has at least 6 char digit
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lst = new ArrayList<>();
        Pattern pattern = Pattern.compile("^\\d{6,}$");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; ++i) {
            String str = sc.nextLine();
            lst.add(str);
        }
        for (String s : lst) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                System.out.println("Oke");
            } else System.out.println("Nope");
        }
    }
}
