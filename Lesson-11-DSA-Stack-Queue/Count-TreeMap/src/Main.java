import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String inputString = "Hello";
        String inputString1 = inputString.toLowerCase();
        System.out.println(inputString1);
        int size = inputString1.length();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < inputString1.length(); i++) {
            char key = inputString1.charAt(i);
            System.out.println(key);
            if (key == ' ') {
                continue;
            }
            if (map.isEmpty()) {
                map.put(key, 1);
            } else {
                map.merge(key, 1, Integer::sum);
            }
        }
        System.out.println(map);
        System.out.println(map.size());
    }
}
