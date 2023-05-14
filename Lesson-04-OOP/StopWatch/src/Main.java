public class Main {
    public static void main(String[] args){
        StopWatch stopWatch= new StopWatch();
        stopWatch.start();
        stopWatch.stop();
        System.out.println("get start: " +stopWatch.getStartTime());
        System.out.println("get end: " +stopWatch.getEndTime());
        System.out.println("get elapsed =" +stopWatch.getElapsedTime());
    }
}
