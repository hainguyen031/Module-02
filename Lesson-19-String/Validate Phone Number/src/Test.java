public class Test {
    private static PhoneNumber phoneNumber;
    private static String[] validNumber = {"(84)-(0978489648)"};
    private static String[] inValidNumber = {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String name : validNumber) {
            boolean isValid = phoneNumber.validate(name);
            System.out.println("Phone number is " +name + " is valid: " +isValid);
        }
        for (String name : inValidNumber) {
            boolean isValid = phoneNumber.validate(name);
            System.out.println("Phone number is " +name + " is valid: " +isValid);
        }
    }
}
