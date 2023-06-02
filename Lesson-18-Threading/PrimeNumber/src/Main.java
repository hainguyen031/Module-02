public class Main {
    public static void main(String[] args) throws InterruptedException {
        LazyPrimeFactorization lazyPrime = new LazyPrimeFactorization();

        OptimizedPrimeFactorization optimizedPrime = new OptimizedPrimeFactorization();
        lazyPrime.start();
        lazyPrime.join();
        optimizedPrime.start();
    }
}
