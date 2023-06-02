public class NumberGenerator implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Count thread "+Thread.currentThread() +i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        System.out.println(Thread.currentThread() +" run is over");
    }

}
