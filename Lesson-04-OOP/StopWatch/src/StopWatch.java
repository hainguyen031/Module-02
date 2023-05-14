import java.time.LocalTime;
public class StopWatch {
    private LocalTime startTime,endTime;
    public StopWatch(){
        LocalTime time=LocalTime.now();
        this.startTime=time;
    }
    public LocalTime getStartTime(){
        return this.startTime;
    }
    public LocalTime getEndTime(){
        return this.endTime;
    }
    public void start(){
        LocalTime time=LocalTime.now();
        this.startTime=time;
    }
    public void stop(){
        LocalTime time=LocalTime.now();
        this.endTime=time.plusSeconds(40);
    }
    public double getElapsedTime(){
        return this.endTime.getSecond() - this.startTime.getSecond();
    }
}