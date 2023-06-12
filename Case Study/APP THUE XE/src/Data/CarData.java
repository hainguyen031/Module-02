package Data;

import entity.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CarData {
    private static final String CAR_FILE = "E:\\CODEGYM\\Module 02\\Case Study\\APP THUE XE\\src\\Data\\Car.csv";

    private void writeFile(List<Car> carList) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(CAR_FILE))) {
            writer.println("ID,Brand,Model,Seat,Price,Available");

            for (Car ele : carList) {
                writer.println(ele.getId() + "," +
                        ele.getBrand() + "," +
                        ele.getModel() + "," +
                        ele.getSeats() + "," +
                        ele.getRentPrice() + "," +
                        ele.isAvailable());
            }

            System.out.println("The data has been saved to a CSV file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Car> readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CAR_FILE))) {
            String line;
            // Bỏ qua dòng tiêu đề
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String brand = data[1];
                String model = data[2];
                int price = Integer.parseInt(data[3]);
                boolean available = Boolean.parseBoolean(data[4]);

                Car car = new Car(id, brand, model, price, available);
                car.add(car);
            }

            System.out.println("Dữ liệu đã được đọc từ file CSV.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
