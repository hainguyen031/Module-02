import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> numbers = readAndWriteFile.readFile("resouce.txt");
        readAndWriteFile.writeToFile("result.txt", numbers);
    }
}
