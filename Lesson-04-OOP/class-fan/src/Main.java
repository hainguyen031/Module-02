public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10.0);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println("Information of fan 1: " + fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5.0);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println("Information of fan 2: " + fan2.toString());
    }
}
