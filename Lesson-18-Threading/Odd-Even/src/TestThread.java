public class TestThread {
    public static void main(String[] args) {
        OddThread num1 = new OddThread();
        EvenThread num2 = new EvenThread();
        num1.start();
        try {
            num1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        num2.start();
    }
}
