public class EvenThread extends Thread{
    @Override
    public void run() {
        int count = 0;
        for (int i = 1; i <=10; i++) {
            if (i % 2 != 0) {
                count++;
                    System.out.println("Even number " + i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Even <10 is: " + count +"number" );
    }
}
