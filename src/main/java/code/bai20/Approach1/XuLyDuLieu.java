package code.bai20.Approach1;

public class XuLyDuLieu extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Xử lý dữ liệu: " + i * 20 + "%");
            try {
                Thread.sleep(800);
            } catch (InterruptedException _) {
            }
        }
    }
}