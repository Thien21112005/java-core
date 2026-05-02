package code.bai20.Approach2;

public class Approach2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new TaiFile());
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Xử lý dữ liệu: " + i * 20 + "%");
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                }
            }
        });

        t1.start();
        t2.start();
        System.out.println("Main vẫn chạy tiếp");
    }
}
