import java.util.Scanner;

public class NumberToWordConverter {

    // Mảng chứa các chữ số từ 0 đến 9
    private static final String[] WORDS = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    // Mảng chứa các chuỗi đọc của các số từ 10 đến 19
    private static final String[] TEENS = {
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    // Mảng chứa các chuỗi đọc của các chữ số hàng chục từ 20 đến 90
    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    // Phương thức chuyển đổi số thành chữ số
    public static String convertNumberToWord(int number) {
        if (number == 0) {
            return "zero";
        }
        if (number < 0) {
            return "minus " + convertNumberToWord(-number);
        }
        if (number < 10) {
            return WORDS[number];
        }
        if (number < 20) {
            return TEENS[number - 10];
        }
        if (number < 100) {
            return TENS[number / 10] + ((number % 10 != 0) ? " " : "") + WORDS[number % 10];
        }
        if (number < 1000) {
            return WORDS[number / 100] + " hundred" + ((number % 100 != 0) ? " and " : "") + convertNumberToWord(number % 100);
        }
        if (number < 1000000) {
            return convertNumberToWord(number / 1000) + " thousand" + ((number % 1000 != 0) ? " " : "") + convertNumberToWord(number % 1000);
        }
        return "number too large";
    }

    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        String word = convertNumberToWord(number);
        System.out.printf("%d = %s", number, word);
    }
}
