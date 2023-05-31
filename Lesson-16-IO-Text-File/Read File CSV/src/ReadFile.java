import java.io.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public List<String> readFile(String filePath) {
        List<String> strings = new ArrayList<>();
        try {
            File file = new File(filePath);

            if(!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strings;
    }

    private void printCountry(List<String> strings) {
        System.out.println("Country [id="
                            +strings.get(0)
                            +", code=" +strings.get(1)
                            +", name=" +strings.get(2)
                            +"]");
    }


    private static List<String> parseCsvLine(String line) {
        List<String> result = new ArrayList<>();
        if (line != null) {
            String[] split = line.split(",");
            for (int i = 0; i < split.length; i++) {
                result.add(split[i]);
            }
        }
        return result;
    }
}
