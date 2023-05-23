import java.util.Stack;

public class StringStack {
    public static void main(String[] args) {
        String inputString = "Welcome to my bug world";
        String[] words = inputString.split(" ");

        Stack<String> wStack = new Stack<>();


        for (String word : words) {
            wStack.push(word);
        }


        StringBuilder output = new StringBuilder();
        while (!wStack.empty()) {
            String poppedWord = wStack.pop();
            output.append(poppedWord).append(" ");
        }
        String reversedString = output.toString().trim();


        System.out.println("Chuỗi sau khi đảo ngược: " + reversedString);
    }
}
