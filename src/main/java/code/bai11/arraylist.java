package code.bai11;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); //generic
        list.add("huhu");
        list.add("hehee");
        list.add("chao ban");

        list.remove(1);

        System.out.println(list.toString() + "\n" + list.size() + "\n" + list.get(1));


    }
}
