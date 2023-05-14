public class Fan {
    public Fan() {
    }
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public boolean isOn() {
        return this.on;
    }
    public boolean setOn(boolean on) {
        return this.on = on;
    }
    public int setSpeed(int speed) {
        return this.speed = speed;
    }
    public int getSpeed() {
        return this.speed;
    }
    public double getRadius() {
        return this.radius;
    }
    public double setRadius(double radius) {
        return this.radius = radius;
    }
    public String getColor() {
        return this.color;
    }
        public String setColor(String color) {
        return this.color = color;
    }
    public String toString() {
        if (isOn()) {
            return "speed " + this.getSpeed() + " color " + this.getColor() + " radius " + this.getRadius() + " fan is on ";
        } else {
            return "color " + this.getColor() + " radius " + this.getRadius() + " fan is off ";
        }
    }
}
