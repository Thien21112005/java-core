package code.bai20.Approach1;

public class TaiFile extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Tải file: " + i * 20 + "%");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException _) {
            }
        }
    }
}