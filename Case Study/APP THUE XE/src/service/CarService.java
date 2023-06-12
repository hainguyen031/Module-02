package service;

import entity.Car;
import entity.SortCarByModel;
import entity.SortCarByPrice;
import entity.SortCarBySeat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarService {
    private static List<Car> carList;

    public CarService() {
    }

    static {
        carList = new ArrayList<>();
        carList.add(new Car(1 , "Toyota", "Fortuner", 7, 1000000));
        carList.add(new Car(2,"Toyota", "Vios", 4, 700000));
        carList.add(new Car(3,"Mitsubishi", "Xpander", 7, 900000));
        carList.add(new Car(4,"MG", "MG5", 4, 600000));
        carList.add(new Car(5,"Toyota", "Fortuner", 7, 700000));
    }

    public static List<Car> getCarList() {
        return carList;
    }

    public static void setCarList(List<Car> carList) {
        CarService.carList = carList;
    }

    public void addCarToList(Car car) {
        carList.add(car);
    }

    public static Car showList() {
        for (Car ele: carList) {
            System.out.println(ele.toString());
        }
        return null;
    }
    public static void SortCarByPrice() {
        Collections.sort(carList, new SortCarByPrice());
    }
    public static void SortCarByModel() {
        Collections.sort(carList, new SortCarByModel());
    }
    public static void SortCarBySeat() {
        Collections.sort(carList, new SortCarBySeat());
    }
}
