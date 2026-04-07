package code.bai6;

public class forloop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            System.out.println(i);
        }
        //Điều kiện sai thì dừng
        System.out.println("=============");
        int i = 10;
        while (i < 5) {
            System.out.println(i);
            ++i;
        }
        //Đúng hay sai thì van thực hiện 1 lần
        System.out.println("=============");

        int k = 10;
        do {
            System.out.println(k);
            ++k;
        } while (k < 5);
    }

}
