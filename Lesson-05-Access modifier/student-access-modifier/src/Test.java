public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println("Name: " + stu1.getName());
        stu1.setName("Harry");
        System.out.println("Name: " + stu1.getName());
        System.out.println("Name: " + stu1.getClasses());
        stu1.setClasses("C03");
        System.out.println("Name: " + stu1.getClasses());
    }
}
