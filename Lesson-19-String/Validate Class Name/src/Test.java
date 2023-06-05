public class Test {
    private static ClassName className;
    public static final String[] validClassName = {"C0223G", "A0323K"};
    public static final String[] inValidClassName = {"M0318G", "P0323A"};
    public static void main(String[] args) {
        className = new ClassName();
        for (String name : validClassName) {
            boolean isValid = className.validate(name);
            System.out.println("Class name is " +name + " is valid: " +isValid);
        }
        for (String name : inValidClassName) {
            boolean isValid = className.validate(name);
            System.out.println("Class name is " +name + " is valid: " +isValid);
        }
    }
}
