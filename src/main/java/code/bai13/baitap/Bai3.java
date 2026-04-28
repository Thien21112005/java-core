package code.bai13.baitap;

import java.util.*;
import java.util.regex.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lst = new ArrayList<>();
        //email pattern
        Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
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
