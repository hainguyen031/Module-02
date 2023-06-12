package service;
import entity.Car;

public class CarFactory {
    CarService carService = new CarService();
    public static Car searchCar(String typeSearch) {
        if (typeSearch.equals("rentPrice")) {
            CarService.SortCarByPrice();
            return CarService.showList();
        } else if (typeSearch.equals("seat")) {
            CarService.SortCarBySeat();
            return CarService.showList();
        } else if (typeSearch.equals("model")) {
            CarService.SortCarByModel();
            return CarService.showList();
        }
        return null;
    }
}
