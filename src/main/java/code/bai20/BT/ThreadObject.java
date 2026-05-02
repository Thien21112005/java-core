package code.bai20.BT;

public class ThreadObject extends Thread {
    @Override
    public void run() {
        System.out.println("Start ThreadObject");
        long sum = 0L;
        for (long i = 0L; i < 10000000000L; i++) {
            sum += i;
        }

        System.out.println("End ThreadObject");
    }


    public static void main(String[] args) {
        int MAX = 8;
        for (int i = 0; i < MAX; i++) {
            new ThreadObject().start();
        }
        System.out.println("Finish ThreadObject");
    }
}
