public class OptimizedPrimeFactorization extends Thread{
    @Override
    public void run() {
        System.out.println("Cac so nguyen to nho hon 20 - by Op : ");
        long startTime = System.currentTimeMillis();
        int number = 2;
        try {
            while (number < 20) {
                Thread.sleep(500);
                int i = 2;
                boolean check = true;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check) {
                    System.out.print(number + " ");
                }
                number++;

            }
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.println("Tong thoi gian by Op: "+ (endTime - startTime)/1000 +"s");
    }
}
