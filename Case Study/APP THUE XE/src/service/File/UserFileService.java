package service.File;

import builder.CustomerBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import entity.Customer;
import entity.User;
import service.UserService;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;


public class UserFileService {
    private static final UserFileService userFileService = new UserFileService();
    private final String USER_FILEPATH = "E:\\CODEGYM\\Module 02\\Case Study\\APP THUE XE\\src\\Data\\user.csv";

    public UserFileService() {
    }

    public static UserFileService getInstance() {
        return userFileService;
    }

//    public void writeUserList() {
//        try {
//            FileWriter fileWriter = new FileWriter(new File(USER_FILEPATH));
//            CSVWriter csvWriter = new CSVWriter(fileWriter, CSVWriter.DEFAULT_SEPARATOR,
//                    CSVWriter.NO_QUOTE_CHARACTER,
//                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
//                    CSVWriter.DEFAULT_LINE_END);
//            for (User user : UserService.getInstance().getUserList()) {
//                if (user.getUsername().equals("staff")) {
//                    continue;
//                }
//                String[] customerStringArray = ((Customer) user).toArray();
//                csvWriter.writeNext(customerStringArray);
//            }
//            csvWriter.close();
//            fileWriter.close();
//        } catch (IOException e) {
//            System.err.println("Write file error");
//            e.printStackTrace();
//        }
//    }
//    public void readUserList() {
//        try {
//            FileReader fileReader = new FileReader(new File(USER_FILEPATH));
//            CSVReader csvReader = new CSVReader(fileReader);
//            String[] data;
//            while ((data = csvReader.readNext()) != null) {
//                User newUser = (User) CustomerBuilder.getInstance()
//                        .username(data[0])
//                        .password(data[1])
//                        .email(data[2])
//                        .phone(data[3])
//                        .name(data[4])
//                        .cccd(Integer.parseInt(data[5]))
//                        .gplx(data[6]);
//                UserService.getInstance().getUserList().add(newUser);
//            }
//            csvReader.close();
//            fileReader.close();
//        } catch (IOException exception) {
//            System.err.println("Read file Error");
//            exception.printStackTrace();
//        } catch (CsvValidationException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public void writeUserList() {
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(USER_FILEPATH));
            for (User user : UserService.getInstance().getUserList()) {  //null point
                if (user.getUsername().equals("staff")) {
                    continue;
                }
                String[] customerStringArray = ((Customer) user).toArray();
                csvWriter.writeNext(customerStringArray);
            }
            csvWriter.close();


        } catch (IOException e) {
            System.err.println("Write file error");
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void readUserList() {
        System.out.println("hello");
    }
}
