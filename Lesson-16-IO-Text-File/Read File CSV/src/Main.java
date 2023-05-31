import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        List<String> fileCountry =readFile.readFile("country.csv");
//        try {
//            File file = new File("country.csv");
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line ="";
//            List<String> arrayList = new ArrayList<>();
//            while ((line = bufferedReader.readLine()) != null) {
//                arrayList.add(Arrays.toString(line.split(",")));
//            }
//            for (String st : arrayList) {
//                System.out.println(st);
//            }
//            bufferedReader.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
