public class OddThread extends Thread{
    @Override
    public void run() {
        int count = 0;
        for (int i = 1; i <=10; i++) {
            if (i % 2 != 0) {
                count++;
                System.out.println("Odd number " + i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Odd <10 is: " + count +"number" );
    }
}
