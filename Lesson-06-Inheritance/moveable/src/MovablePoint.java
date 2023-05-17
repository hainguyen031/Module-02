public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint() {}
    public float getXSpeed() {
        return this.xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return this.ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[] {this.xSpeed, this.ySpeed};
    }

    @Override
    public String toString() {
        return super.toString() +
                ", speed(" + xSpeed +
                ", " + ySpeed +
                ')';
    }
    public void move() {
        float newX = super.getX() + xSpeed;
        float newY = super.getY() + ySpeed;
        setX(newX);
        setY(newY);
    }

}
