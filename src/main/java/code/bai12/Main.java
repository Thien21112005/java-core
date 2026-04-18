package code.bai12;

import java.util.*;

public class Main {
    //Find the Student startWith name "Nguyen"
    public static ArrayList<Student> nhapStudent(int n, Scanner sc) {
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            System.out.print("Input id: ");
            int id = sc.nextInt();
            System.out.print("Input name: ");
            sc.nextLine();
            String name = sc.nextLine();
            Student student = new Student(id, name);
            list.add(student);
        }
        sc.close();
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong hoc sinh: ");
        int n = sc.nextInt();
        ArrayList<Student> lst = nhapStudent(n, sc);
        for (Student student : lst) {
            if (student.getName().startsWith("Nguyen")) {
                System.out.println(student);
            }
        }
    }
}
