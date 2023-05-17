public class Test {
    public static void main(String[] args) {
        MovablePoint mv = new MovablePoint();
        System.out.println(mv.toString());

        MovablePoint mv1 = new MovablePoint(1,1,2,3);
        System.out.println(mv1.toString());
        mv1.move();
        System.out.println(mv1.toString());
        mv1.move();
        System.out.println(mv1.toString());
    }
}
