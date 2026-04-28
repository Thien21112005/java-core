package code.bai13;

import java.util.*;
import java.util.regex.*;

public class regularExpression {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("thien", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hom do nguoi yeu ban Thien cuoi rat vui");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match Found");
        } else System.out.println("Match Not Found");
    }
}
