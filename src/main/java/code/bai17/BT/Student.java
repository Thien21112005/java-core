package code.bai17.BT;

import java.util.Scanner;

public class Student extends Person {
    private int mark;
    private String grade;

    public Student(String id, String name, int age, int mark, String grade) {
        super(id, name, age);
        this.mark = mark;
        this.grade = grade;
    }

    public Student() {
        super();
        this.mark = 0;
        this.grade = "";
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm: ");
        mark = sc.nextInt();
        setGrade();
    }

    public int getMark() {
        return mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setGrade() {
        if (mark >= 8) grade = "A";
        else if (mark >= 7) grade = "B";
        else if (mark >= 6) grade = "C";
        else if (mark >= 5) grade = "D";
        else grade = "F";
    }

    @Override
    public String toString() {
        return super.toString() + "Student [mark=" + mark + ", grade=" + grade + "]";
    }


}
