import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<String> readFile(String filePath) {
        List<String> strings = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader rd = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line= rd.readLine()) != null) {
                strings.add(line);
            }
            rd.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại !");
        }
        return strings;
    }

    public void writeToFile(String file, List<String> numbers) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            for (String st : numbers) {
                bw.write(st);
            }
            bw.close();
            System.out.println("Ghi file thanh cong");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
